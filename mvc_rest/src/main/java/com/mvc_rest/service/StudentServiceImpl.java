package com.mvc_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc_rest.dao.StudentDao;
import com.mvc_rest.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao;

	@Override
	public void createStudent(Student student) {
		dao.createStudent(student);
	}

	@Override
	public Student getByRoll(Integer roll) {
		return dao.getByRoll(roll);
	}

	@Override
	public Student updateStudent(Student student) {
		Student s=dao.updateStudent(student);
		return s;
	}

	
}
