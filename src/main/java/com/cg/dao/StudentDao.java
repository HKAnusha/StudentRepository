package com.cg.dao;

import java.util.List;

import com.cg.entity.Student;

public interface StudentDao {
	public String addStudent(Student student);
	public List<Student> getStudentList();

}
