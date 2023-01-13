package com.mvc_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc_rest.model.Student;
import com.mvc_rest.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
	
	
	@PostMapping("/createStudent")
	public @ResponseBody String  createStudent(@RequestBody Student student) {
		service.createStudent(student);
		
		return "succssefull";
	}
	

	@GetMapping(value = "/getStudent",produces = MediaType.APPLICATION_JSON_VALUE)
	public@ResponseBody Student getByRoll(@RequestBody Integer roll) {
		Student s=service.getByRoll(roll);
		return s;
	}
	
	@PutMapping("/updateStudent")
	public @ResponseBody String updateStudent(@RequestBody Student student) {
		service.updateStudent(student);
		return "done";
	}
	
}
