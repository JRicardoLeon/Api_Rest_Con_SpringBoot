package com.Api_Rest.service;

import com.Api_Rest.persistence.entetys.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private final TaskService taskService;

    public TaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    public Task TaskCreate(Task task){
       return  null;
    }
}
