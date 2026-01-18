package com.student.demo;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@Entity
@Table(
        name = "students",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "register_id"),
                @UniqueConstraint(columnNames = "email")
        }
)
@Component
public class Student {

    @Id
    @Column(name = "register_id", nullable = false, updatable = false)
    private String registerId;   // University registration number

    @Column(name = "full_name", nullable = false)
    private String studentName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(length = 15)
    private String phone;

    private String address;

    @Enumerated(EnumType.STRING)
    private StudentStatus status;

    private LocalDate dateOfBirth;

    private String department;

    private Integer admissionYear;

    @PrePersist
    public void prePersist(){
        admissionYear = LocalDate.now().getYear();
    }
}
