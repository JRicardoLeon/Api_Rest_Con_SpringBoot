package com.Api_Rest.mapper;

import com.Api_Rest.persistence.entetys.Task;
import com.Api_Rest.persistence.entetys.TaskState;
import com.Api_Rest.service.dto.TaskDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskDTO_Task implements TaskDTOMapper<TaskDTO, Task>{

    @Override
    public Task map(TaskDTO in) {
        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setTimeTask(in.getTimeTask());
        task.setCreateDate(LocalDateTime.now());
        task.setCompleted(false);
        task.setTaskState(TaskState.ON_TIME);
        return task;
    }
}
