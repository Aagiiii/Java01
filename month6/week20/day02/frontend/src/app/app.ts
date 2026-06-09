import { Component, signal, computed, OnInit, inject } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Todo } from './todo.model';
import { FormsModule } from '@angular/forms';
import { DatePipe } from '@angular/common';

@Component({
    selector: 'app-root',
    imports: [FormsModule, DatePipe],
    templateUrl: './app.html',
    styleUrl: './app.css'
})
export class App implements OnInit {
    private http = inject(HttpClient);
    private readonly API = 'http://localhost:8080/api';

    private get headers() {
        return new HttpHeaders({ 'X-Username': this.username() || '' });
    }

    readonly username = signal<string | null>(localStorage.getItem('todo-username'));
    readonly loginInput = signal('');

    readonly newTitle = signal('');
    readonly newPriority = signal<string>('NORMAL');
    readonly newDeadline = signal('');
    readonly newDescription = signal('');

    readonly filterStatus = signal<string>('all');
    readonly filterPriority = signal<string>('all');
    readonly filterFromDate = signal('');
    readonly filterToDate = signal('');

    readonly todos = signal<Todo[]>([]);

    private readonly activeTodos = computed(() => this.todos().filter(t => !t.completed));
    private readonly completedTodos = computed(() => this.todos().filter(t => t.completed));

    readonly activeCount = computed(() => this.activeTodos().length);
    readonly completedCount = computed(() => this.completedTodos().length);

    readonly filteredTodos = computed(() => {
        let list = this.todos();
        const status = this.filterStatus();
        const priority = this.filterPriority();
        const from = this.filterFromDate();
        const to = this.filterToDate();

        if (status === 'active') list = list.filter(t => !t.completed);
        else if (status === 'completed') list = list.filter(t => t.completed);

        if (priority !== 'all') list = list.filter(t => t.priority === priority);

        if (from) {
            const f = new Date(from).getTime();
            list = list.filter(t => new Date(t.createdAt).getTime() >= f);
        }
        if (to) {
            const toMs = new Date(to + 'T23:59:59').getTime();
            list = list.filter(t => new Date(t.createdAt).getTime() <= toMs);
        }

        return list.sort((a, b) => new Date(b.createdAt).getTime() - new Date(a.createdAt).getTime());
    });

    readonly activeFiltered = computed(() => this.filteredTodos().filter(t => !t.completed));
    readonly completedFiltered = computed(() => this.filteredTodos().filter(t => t.completed));

    ngOnInit() {
        if (this.username()) this.loadTodos();
    }

    login() {
        const name = this.loginInput().trim();
        if (!name) return;
        const user = name;
        this.http.post<{ username: string }>(`${this.API}/auth/login`, { username: name })
            .subscribe({
                next: () => {
                    this.username.set(user);
                    localStorage.setItem('todo-username', user);
                    this.loadTodos();
                },
                error: err => console.error('Login failed', err)
            });
    }

    logout() {
        this.username.set(null);
        localStorage.removeItem('todo-username');
        this.todos.set([]);
    }

    loadTodos() {
        const user = this.username();
        this.http.get<Todo[]>(`${this.API}/todos`, { headers: this.headers })
            .subscribe({
                next: todos => {
                    if (this.username() === user) this.todos.set(todos);
                },
                error: err => console.error('Load todos failed', err)
            });
    }

    add() {
        const title = this.newTitle().trim();
        if (!title) return;
        const user = this.username();
        const body: Record<string, unknown> = { title };
        body['priority'] = this.newPriority();
        if (this.newDeadline()) body['deadline'] = new Date(this.newDeadline()).toISOString();
        if (this.newDescription().trim()) body['description'] = this.newDescription().trim();
        this.http.post<Todo>(`${this.API}/todos`, body, { headers: this.headers })
            .subscribe({
                next: () => {
                    if (this.username() !== user) return;
                    this.newTitle.set('');
                    this.newDeadline.set('');
                    this.newDescription.set('');
                    this.newPriority.set('NORMAL');
                    this.loadTodos();
                },
                error: err => console.error('Add task failed', err)
            });
    }

    toggle(todo: Todo) {
        const user = this.username();
        this.http.put<Todo>(`${this.API}/todos/${todo.id}`, { ...todo, completed: !todo.completed }, { headers: this.headers })
            .subscribe({
                next: () => {
                    if (this.username() === user) this.loadTodos();
                },
                error: err => console.error('Toggle task failed', err)
            });
    }

    remove(id: number) {
        const user = this.username();
        this.http.delete(`${this.API}/todos/${id}`, { headers: this.headers })
            .subscribe({
                next: () => {
                    if (this.username() === user) this.loadTodos();
                },
                error: err => console.error('Delete task failed', err)
            });
    }
}
