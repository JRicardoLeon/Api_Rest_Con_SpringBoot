package com.Api_Rest.service;

import com.Api_Rest.mapper.TaskDTO_Task;
import com.Api_Rest.persistence.entetys.Task;
import com.Api_Rest.persistence.entetys.TaskState;
import com.Api_Rest.persistence.repository.TaskRepository;
import com.Api_Rest.service.dto.TaskDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private final TaskRepository taskRepository;
    private final TaskDTO_Task mapper;

    public TaskService(TaskRepository taskRepository, TaskDTO_Task mapper) {
        this.taskRepository = taskRepository;
        this.mapper = mapper;
    }

    public Task CreateTask(TaskDTO taskDTO){
        Task task = mapper.map(taskDTO);
       return this.taskRepository.save(task);
    }

    public List<Task> getAll(){
        return this.taskRepository.findAll();
    }

    public List<Task> listarPorEstado(TaskState taskState){
        return this.taskRepository.findAllByTaskStatus(taskState);
    }
}
