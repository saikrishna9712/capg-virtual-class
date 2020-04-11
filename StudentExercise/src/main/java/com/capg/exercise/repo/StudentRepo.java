package com.capg.exercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.exercise.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	@Query(value= "from Student where studentName=:studentName")
	public Student getStudentByName(String studentName);

}
