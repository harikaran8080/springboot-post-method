package com.CRUD.operation.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.operation.student.entity.Students;
import com.CRUD.operation.student.repository.student_repository;

@RestController
@RequestMapping("api/student")
public class Student_controller {
	
	@Autowired
	student_repository repo;
	
	@PostMapping("/students")
	
	public Students getAllStudents(@RequestBody Students students){
		Students student = repo.save(students);
		return student;
	}
 
}
