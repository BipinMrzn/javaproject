package com.project.CrudApp.controller;

import com.project.CrudApp.dto.StudentDto;
import com.project.CrudApp.dto.StudentsResponse;
import com.project.CrudApp.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1/students")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentsResponse createNewStudent(@RequestBody StudentDto studentDto) {
        return studentService.createNewStudent(studentDto);
    }
}
