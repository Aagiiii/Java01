package mn.icode.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import mn.icode.model.Todo;
import mn.icode.model.Todo.Priority;
import mn.icode.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public List<Todo> getAll(
            @RequestHeader("X-Username") String username,
            @RequestParam(required = false) Boolean completed,
            @RequestParam(required = false) String priority,
            @RequestParam(required = false) LocalDate fromDate,
            @RequestParam(required = false) LocalDate toDate) {

        Stream<Todo> stream;

        if (completed != null) {
            stream = todoRepository.findByUsernameAndCompleted(username, completed).stream();
        } else {
            stream = todoRepository.findByUsername(username).stream();
        }

        if (priority != null) {
            try {
                Priority p = Priority.valueOf(priority.toUpperCase());
                stream = stream.filter(t -> t.getPriority() == p);
            } catch (IllegalArgumentException ignored) {}
        }

        if (fromDate != null) {
            LocalDateTime from = fromDate.atStartOfDay();
            stream = stream.filter(t -> !t.getCreatedAt().isBefore(from));
        }

        if (toDate != null) {
            LocalDateTime to = toDate.atTime(LocalTime.MAX);
            stream = stream.filter(t -> !t.getCreatedAt().isAfter(to));
        }

        return stream
                .sorted(Comparator.comparing(Todo::getCreatedAt).reversed())
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getById(@PathVariable Long id) {
        return todoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Todo> create(
            @RequestHeader("X-Username") String username,
            @RequestBody Todo todo) {
        todo.setId(null);
        todo.setUsername(username);
        todo.setCreatedAt(LocalDateTime.now());
        if (todo.getCompleted() == null) todo.setCompleted(false);
        if (todo.getPriority() == null) todo.setPriority(Priority.NORMAL);
        Todo saved = todoRepository.save(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> update(
            @PathVariable Long id,
            @RequestBody Todo todo) {
        return todoRepository.findById(id)
                .map(existing -> {
                    existing.setTitle(todo.getTitle());
                    existing.setDescription(todo.getDescription());
                    existing.setCompleted(todo.getCompleted());
                    existing.setPriority(todo.getPriority());
                    existing.setDeadline(todo.getDeadline());
                    return ResponseEntity.ok(todoRepository.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!todoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        todoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
