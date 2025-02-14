package com.spring.SpringJDBCexample;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.spring.SpringJDBCexample.controller.StudentController;
import com.spring.SpringJDBCexample.entity.Student;

@SpringBootApplication
public class SpringJdbCexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringJdbCexampleApplication.class, args);
		
		Student student =new Student();
		student.setRollNo(105);
		student.setName("yeswanth");
		student.setMark(100);
		
		StudentController studentController = context.getBean(StudentController.class);
		
		studentController.save(student);	
		
		List<Student> getStudent = studentController.getStudent();
		
		System.out.println(getStudent);
	}

}
