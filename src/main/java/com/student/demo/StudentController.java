package com.student.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1")
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
