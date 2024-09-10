package com.student_management_system.StudentManagementSystem.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	@Id
	private int id;
	
	@Field(name = "name")
	private String name;
	
	@Field(name = "contact_details")
	private String contactDetails;
	
	@Field(name = "address")
	private String address;
	
	@Field(name = "pincode")
	private String pincode;
}
