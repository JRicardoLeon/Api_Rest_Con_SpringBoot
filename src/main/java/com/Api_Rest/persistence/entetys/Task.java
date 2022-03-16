package com.Api_Rest.persistence.entetys;

import lombok.Data;

import javax.persistence.*;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime finishDate;
    private boolean completed;
    private TaskState TaskState;

}
