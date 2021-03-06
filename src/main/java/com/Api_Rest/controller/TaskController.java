package com.Api_Rest.controller;

import com.Api_Rest.persistence.entetys.Task;
import com.Api_Rest.persistence.entetys.TaskState;
import com.Api_Rest.service.TaskService;
import com.Api_Rest.service.dto.TaskDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task crearTarea(@RequestBody TaskDTO taskdto) {
        return this.taskService.CreateTask(taskdto);
    }

    @GetMapping
    public List<Task> Listar_Tareas() {
        return this.taskService.getAll();
    }
    @GetMapping("/status/{status}")
    public List<Task> findAllbyStatus(@PathVariable("status") TaskState status){
        return this.taskService.findAllByTaskState(status);
    }

}
