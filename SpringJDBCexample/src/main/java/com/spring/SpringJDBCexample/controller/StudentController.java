package com.spring.SpringJDBCexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.SpringJDBCexample.entity.Student;
import com.spring.SpringJDBCexample.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	public void save(Student student) {
		studentService.save(student);
	}

	public List<Student> getStudent() {
		
		return studentService.getStudents();
	}

}
