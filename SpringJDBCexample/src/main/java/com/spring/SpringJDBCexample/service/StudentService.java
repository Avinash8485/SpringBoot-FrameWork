package com.spring.SpringJDBCexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringJDBCexample.entity.Student;
import com.spring.SpringJDBCexample.repository.StudentRepository;

@Service
public class StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void save(Student student) {
			studentRepository.save(student);
	}

	public List<Student> getStudents() {
		return studentRepository.getStudents();
	}
	

}
