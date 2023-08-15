package com.example.student.studentmanagement.reposititory;

import com.example.student.studentmanagement.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReposititory extends JpaRepository<StudentEntity,Integer> {
}
