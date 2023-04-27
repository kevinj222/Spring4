package com.example.SpringBootTestDemo.service;

import com.example.SpringBootTestDemo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentServices {
    Student addStudent(Student student);

    List<Student> getAllStudent();

  

    Student deleteStudentById(Integer id);

    Student getStudentById(Integer id);

    List<Student> getStudentByName(String name);
}
