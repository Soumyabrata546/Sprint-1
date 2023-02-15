package com.spring.StudentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.StudentManagement.entity.Student;
import com.spring.StudentManagement.repo.StudentRepository;

@org.springframework.stereotype.Service
public class Serviceimpl implements Service{
	
	@Autowired
	StudentRepository student;
	@Override
	public Student createStudent(Student stu) {
		// TODO Auto-generated method stub
		return student.save(stu);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return student.findAll();
		}

	@Override
	public Student getAnStudent(long id) {
		// TODO Auto-generated method stub
		return student.findById(id).get();
	}

	@Override
	public Student update(Student stu, long id) {
		// TODO Auto-generated method stub
		Student stu1 = student.findById(id).get();
		stu1.setAddress(stu.getAddress());
		stu1.setDept(stu.getDept());
		stu1.setName(stu.getName());
		return student.save(stu1);
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		student.deleteById(id);
		return "The Student with id: " + id + " has been deleted!!!";
	}

	@Override
	public Student findByName(String name) {
		// TODO Auto-generated method stub
		return student.findByName(name);
	}

	@Override
	public String save() {
		// TODO Auto-generated method stub
		Student s1 = Student.builder().id(1).name("Soumya").address("Andal").dept("CS").build();
		Student s2 = Student.builder().id(2).name("Suvam").address("Andal").dept("CS").build();
		student.save(s1);
		student.save(s2);
		return "-------------Data Saved------------";
	}
	

}
