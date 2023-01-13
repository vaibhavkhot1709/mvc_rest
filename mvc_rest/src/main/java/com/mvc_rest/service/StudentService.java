package com.mvc_rest.service;

import com.mvc_rest.model.Student;

public interface StudentService {

	public void createStudent(Student student);
	public Student getByRoll(Integer roll);
	public Student updateStudent(Student student);

}
