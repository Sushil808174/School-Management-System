package com.school.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stId;
    private String studentName;
    private String fatherName;
    private String email;
    private String mobNumber;
    private String address;
    private LocalDateTime admissiondate;
    private Set<Subject> subject;
    private Classes classNo;
}
