package mn.icode.repository;

import java.util.List;
import mn.icode.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByUsername(String username);

    List<Todo> findByUsernameAndCompleted(String username, Boolean completed);
}
