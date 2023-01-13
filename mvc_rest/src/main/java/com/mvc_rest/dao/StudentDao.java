package com.mvc_rest.dao;

import com.mvc_rest.model.Student;

public interface StudentDao {
	
	public void createStudent(Student student);
	public Student getByRoll(Integer roll);
	public Student updateStudent(Student student);
	
}
