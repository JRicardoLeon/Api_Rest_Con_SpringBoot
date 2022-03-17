package com.Api_Rest.persistence.repository;

import com.Api_Rest.persistence.entetys.Task;
import com.Api_Rest.persistence.entetys.TaskState;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    public List<Task> findAllByTaskStatus(TaskState status);
}
