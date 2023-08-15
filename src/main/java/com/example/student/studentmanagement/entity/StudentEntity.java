package com.example.student.studentmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="studentregi")
public class StudentEntity {
    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String  email;
}
