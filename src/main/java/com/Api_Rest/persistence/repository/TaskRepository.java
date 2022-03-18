package com.Api_Rest.persistence.repository;

import com.Api_Rest.persistence.entetys.Task;
import com.Api_Rest.persistence.entetys.TaskState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

      List<Task> findByTaskState(TaskState state);

}
