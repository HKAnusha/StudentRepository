package com.cg.service;

import java.util.List;
import java.util.ArrayList;
import com.cg.dao.StudentDao;
import com.cg.entity.Student;

public class StudentService implements StudentDao {
	
	List<Student> students = new ArrayList<Student>();

	@Override
	public String addStudent(Student student) {
		students.add(student);
		return "Students added successfully";
	}

	@Override
	public List<Student> getStudentList() {
		
		return students;
	}

}
