package todo.app.softwareTraineeAssignment.todo.app.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import todo.app.softwareTraineeAssignment.todo.app.Entity.Task;
import todo.app.softwareTraineeAssignment.todo.app.Service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;
//http://localhost:8080/tasks
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
    //http://localhost:8080/tasks

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
//http://localhost:8080/tasks/{id}
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }
//http://localhost:8080/tasks/{id}
    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestParam String status) {
        return taskService.updateTaskStatus(id, status);
    }
//http://localhost:8080/tasks/{id}
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
