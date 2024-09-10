package com.student_management_system.StudentManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

// Import your Student entity class
import com.student_management_system.StudentManagementSystem.entity.*;

@Service
public class StudentService {
	 @Autowired
	  private MongoTemplate mongoTemplate;
	  
	  public void createStudent(Student student) {
	    mongoTemplate.insert(student);
	  }
	  
	  public List<Student> getAllStudents() {
	    return mongoTemplate.findAll(Student.class);
	  }
	  
	  public void updateStudent(String name, String newEmail) {
	    Query query = new Query(Criteria.where("name").is(name));
	    Update update = new Update().set("email", newEmail);
	    mongoTemplate.updateFirst(query, update, Student.class);
	  }
	  
	  public void deleteStudent(Student student) {
	    mongoTemplate.remove(student);
	  }
}
