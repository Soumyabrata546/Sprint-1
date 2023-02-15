package com.spring.StudentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.StudentManagement.entity.Student;
import com.spring.StudentManagement.service.*;
@RestController
public class Controller {
	@Autowired
	private Service student;
	
	 
	@GetMapping("/")
	public String save()
	{
		return student.save();
	}
	
	@GetMapping("/students")
	public List<Student> getCAllEmployee()
	{
		return student.getAllStudents();
	}
	// Get an student detail by id
	@GetMapping("/students/{id}")
	public Student getanStudent(@PathVariable long id) {
		return student.getAnStudent(id);
	}
	@GetMapping(value = "/studentsByName/{name}")
	public Student getbyname(@PathVariable String name) {

		return student.findByName(name);
	}
	// Create an student
	@PostMapping("/students")
	public Student createAnewStudent(@RequestBody Student stu)
	{
		return student.createStudent(stu);
	}
	// Update an Student 
	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable long id, @RequestBody Student stu)
	{
		return student.update(stu, id);
	}
	//Delete an existing student by id
	@DeleteMapping("/students/{id}")
	public String deleteCAnstudent(long id)
	{
		return student.delete(id);
	}
	
	}
