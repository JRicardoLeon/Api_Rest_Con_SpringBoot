package com.Api_Rest.service.dto;


import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TaskDTO {
    private String title;
    private String description;
    private LocalDateTime TimeTask;
}
