package com.capg.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.exercise.model.Student;
import com.capg.exercise.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return service.getAllstudents();
		
	}
	
	@GetMapping("/student/name/{studentName}")
	public Student getStudentByName(@PathVariable String studentName) {
		
		return service.getStudentByName(studentName);
	}
	
	
	@GetMapping("/student/id/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudent(id);
	}
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student newStudent) {
		return service.updateStudent(newStudent);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteStudentById(@PathVariable int id) {
		Student std=service.getStudent(id);
		return service.deleteStudent(std);
	}
	
	

}
