package com.student_management_system.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student_management_system.StudentManagementSystem.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {
	List<Student> findByName(String name);

    List<Student> findByEmail(String email);
}