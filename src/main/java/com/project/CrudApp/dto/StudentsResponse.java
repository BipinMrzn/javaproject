package com.project.CrudApp.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentsResponse {
    private Long studentId;
    private String firstName;
    private String lastName;
    private int rollNumber;
}
