package com.example.student.studentmanagement.service;

import com.example.student.studentmanagement.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<StudentEntity> getAll();

    StudentEntity getbyid(int id);

    void post(StudentEntity studentEntity);

    void posts(List<StudentEntity> studentEntities);

    void delete(int id);

    StudentEntity update(StudentEntity studentEntity);

}
