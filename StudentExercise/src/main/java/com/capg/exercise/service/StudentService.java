package com.capg.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.exercise.exceptions.StudentNotFoundException;
import com.capg.exercise.model.Student;
import com.capg.exercise.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
	@Transactional
	public List<Student> getAllstudents() {
		return repo.findAll();
		}
	
	
	@Transactional
	public Student getStudent(int studentId) {
		Student student=repo.getOne(studentId);
		if(student==null) {
			throw new StudentNotFoundException("Student Not Found with Student ID : ["+studentId+"]");
		}
		return student;
	}
	
	
	@Transactional
	public Student getStudentByName(String name) {
		Student student=repo.getStudentByName(name);
        if(student==null) {
			
			throw new StudentNotFoundException("Student Not Found with Student Name : ["+name+"]");
		}
		return student;
	}
	
	@Transactional
	public Student addStudent(Student student) {
		return repo.save(student);
	}
	
	@Transactional
	public Student updateStudent(Student newStudent) {
		Student oldStudent=repo.getOne(newStudent.getStudentId());
		if(oldStudent==null) {
			throw new StudentNotFoundException("No Student found with details : "+newStudent);
		}
		oldStudent.setStudentName(newStudent.getStudentName());
		oldStudent.setDob(newStudent.getDob());
		return repo.save(oldStudent);
	}
	
	@Transactional
	public boolean deleteStudent(Student student) {
		int id=student.getStudentId();
		if(repo.getOne(id)==null) {
			throw new StudentNotFoundException("Student Not Found");
		}
		repo.delete(student);
		if(repo.getOne(student.getStudentId())== null) {
			return true;
		}
		return false;
	}
	
	
	
	
	

}
