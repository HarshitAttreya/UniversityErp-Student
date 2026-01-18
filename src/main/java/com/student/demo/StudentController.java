package com.student.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/Student")
    public List<Student> getStudents(){
        return service.getAllStudents();
    }

    @PostMapping("/Student/{student}")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }
}
