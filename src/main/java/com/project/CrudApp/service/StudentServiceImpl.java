package com.project.CrudApp.service;

import com.project.CrudApp.dto.StudentDto;
import com.project.CrudApp.dto.StudentsResponse;
import com.project.CrudApp.model.Student;
import com.project.CrudApp.repo.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentsResponse createNewStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setRollNumber(studentDto.getRollNumber());

        Student student1 = studentRepository.save(student);

        return StudentsResponse.builder()
                .rollNumber(student1.getRollNumber())
                .firstName(student1.getFirstName())
                .lastName(student1.getLastName())
                .studentId(student1.getId())
                .build();
    }
}
