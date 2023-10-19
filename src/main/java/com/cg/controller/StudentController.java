package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.entity.Student;
import com.cg.service.StudentService;

public class StudentController extends StudentService{
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/")
	public String addStudent(@RequestBody Student s) {
		return service.addStudent(s);
	}
	
	@GetMapping("/")
	public List<Student> getStudentList(){
		return service.getStudentList();
	}

}
