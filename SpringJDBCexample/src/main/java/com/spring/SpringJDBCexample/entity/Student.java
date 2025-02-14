package com.spring.SpringJDBCexample.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student{
	
	@Id
	private int rollno;
	private String name;
	private int mark;
	public int getRollNo() {
		return rollno;
	}
	public void setRollNo(int rollNo) {
		this.rollno = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	

}
