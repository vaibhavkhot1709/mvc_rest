package com.mvc_rest.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc_rest.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory factory;

	Session session;
	Transaction transaction;

	@Override
	public void createStudent(Student student) {
		session = factory.openSession();
		transaction = session.beginTransaction();

		session.save(student);
		transaction.commit();
	}

	@Override
	public Student getByRoll(Integer roll) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Student s = session.get(Student.class, roll);

		tx.commit();
		return s;
	}

	@Override
	public Student updateStudent(Student student) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.saveOrUpdate(student);
		
		Student s= session.get(Student.class, student.getRoll());
		txn.commit();
		return s;
	}

}
