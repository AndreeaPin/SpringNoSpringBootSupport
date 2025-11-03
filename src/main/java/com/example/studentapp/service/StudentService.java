package com.example.studentapp.service;

import com.example.studentapp.dao.StudentDao;

import com.example.studentapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentDao repository;


    public StudentService(StudentDao repository) {
        this.repository = repository;
    }
    public List<Student> getAll() {
        return repository.findAll();
    }

    public void add(String studentName) {
        repository.save(new Student(repository.findAll().size() + 1, studentName));
    }
}
