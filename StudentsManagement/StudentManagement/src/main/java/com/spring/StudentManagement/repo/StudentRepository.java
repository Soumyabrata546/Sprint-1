package com.spring.StudentManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.StudentManagement.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Long>{
	public Student findByName(String name);
}
