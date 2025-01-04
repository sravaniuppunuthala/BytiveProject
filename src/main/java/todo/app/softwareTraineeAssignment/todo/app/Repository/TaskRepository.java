package todo.app.softwareTraineeAssignment.todo.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.app.softwareTraineeAssignment.todo.app.Entity.Task;

@Repository
    public interface TaskRepository extends JpaRepository<Task, Long> {
    }


