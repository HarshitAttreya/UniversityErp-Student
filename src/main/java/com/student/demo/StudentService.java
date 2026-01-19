package com.student.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    @Autowired
    private studentRepository studentRepo;
    public List<Student> getAllStudents(){

    }
    public void addStudent(Student student){

    }
}
