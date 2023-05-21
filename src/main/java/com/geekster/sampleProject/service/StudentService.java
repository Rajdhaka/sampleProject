package com.geekster.sampleProject.service;

import com.geekster.sampleProject.model.Student;
import com.geekster.sampleProject.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    public Optional<Student> getStudent(Long studentId) {
        return studentRepo.findById(studentId);
    }
}
