package com.student_management_system.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student_management_system.StudentManagementSystem.entity.Student;
import com.student_management_system.StudentManagementSystem.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}
}
