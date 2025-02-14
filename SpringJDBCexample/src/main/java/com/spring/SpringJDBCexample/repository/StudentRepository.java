package com.spring.SpringJDBCexample.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.SpringJDBCexample.entity.Student;

@Repository
public class StudentRepository {
	
	private JdbcTemplate jdbc;
	

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student student) {
		String sql = "insert into student(rollNo,name,mark) values (?,?,?)";
		int rows = jdbc.update(sql,student.getRollNo(),student.getName(),student.getMark());
		System.out.println(rows);
	}

	public List<Student> getStudents() {
		String sql = "select * from student";
		RowMapper<Student> result = new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setRollNo(rs.getInt("rollno"));	
				s.setMark(rs.getInt("mark"));
				s.setName(rs.getString("name"));
				
				
				return s;
			}
		};
		
		return jdbc.query(sql,result);
	}

}
