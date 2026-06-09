export interface Todo {
    id: number;
    title: string;
    description?: string;
    completed: boolean;
    priority: 'IMPORTANT' | 'URGENT' | 'NORMAL' | 'LOW';
    deadline?: string;
    createdAt: string;
    username: string;
}
