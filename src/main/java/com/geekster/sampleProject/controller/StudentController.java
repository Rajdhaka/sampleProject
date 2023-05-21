package com.geekster.sampleProject.controller;

import com.geekster.sampleProject.model.Student;
import com.geekster.sampleProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @GetMapping("/student/{studentId}")
    public Optional<Student> getStudent(@PathVariable Long studentId){
       return studentService.getStudent(studentId);
    }
}
