package com.example.student.studentmanagement.service;

import com.example.student.studentmanagement.entity.StudentEntity;
import com.example.student.studentmanagement.reposititory.StudentReposititory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplement implements StudentService{
    @Autowired
    private StudentReposititory studentReposititory;

    @Override
    public List<StudentEntity> getAll() {

        return studentReposititory.findAll();
    }

    @Override
    public StudentEntity getbyid(int id) {
        return studentReposititory.findById(id).get();
    }

    @Override
    public void  post(StudentEntity studentEntity) {
        studentReposititory.save(studentEntity);

    }

    @Override
    public void posts(List<StudentEntity> studentEntities) {
        studentReposititory.saveAll(studentEntities);
    }

    @Override
    public void delete(int id) {
        studentReposititory.deleteById(id);
    }

    @Override
    public StudentEntity update(StudentEntity studentEntity) {
        Integer Rollnumber=studentEntity.getId();
        StudentEntity st=studentReposititory.findById(Rollnumber).get();

        st.setFirstname(studentEntity.getFirstname());
        st.setLastname(studentEntity.getLastname());
        st.setEmail(studentEntity.getEmail());
        return studentReposititory.save(st);
    }
}
