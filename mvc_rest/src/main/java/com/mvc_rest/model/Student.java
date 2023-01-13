package com.mvc_rest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {

	@Id
	Integer roll;
	@Column
	String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	

}
