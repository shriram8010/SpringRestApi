package com.example.student.studentmanagement.controller;

import com.example.student.studentmanagement.entity.StudentEntity;
import com.example.student.studentmanagement.service.StudentServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceImplement studentServiceImplement;

    @GetMapping("/getall")
    List<StudentEntity> getall(){
        return studentServiceImplement.getAll();
    }

    @GetMapping("/get/{id}")
    StudentEntity getbyid(@PathVariable int id){
        return studentServiceImplement.getbyid(id);
    }

    @PostMapping("/post")
    String  post(@RequestBody StudentEntity studentEntity){
        studentServiceImplement.post(studentEntity);
        return "data save";
    }

    @PostMapping( "/posts")
        String posts(@RequestBody  List<StudentEntity> studentEntities){
            studentServiceImplement.posts(studentEntities);
            return "data saved";
        }
    @DeleteMapping("/delete/{id}")
    String delete(@PathVariable int id){
        studentServiceImplement.delete(id);
        return "id removed";
    }
    @PutMapping("/update")
    StudentEntity update(@RequestBody StudentEntity studentEntity){
        return studentServiceImplement.update(studentEntity);
    }
}
