package com.spring.StudentManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.StudentManagement.entity.Student;

@Component
public interface Service {
Student createStudent(Student stu);
	
	List<Student> getAllStudents();
	
	Student getAnStudent(long id);
	
	Student update (Student stu, long id);
	
	String delete (long id);
	
	Student findByName(String name);
	
	 String save();
	
}
