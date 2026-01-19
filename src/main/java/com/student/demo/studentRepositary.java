package com.student.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public class studentRepository extends JpaRepository<Student,Integer> {

}
