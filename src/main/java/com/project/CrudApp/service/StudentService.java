package com.project.CrudApp.service;

import com.project.CrudApp.dto.StudentDto;
import com.project.CrudApp.dto.StudentsResponse;

public interface StudentService {
    StudentsResponse createNewStudent(StudentDto studentDto);
}
