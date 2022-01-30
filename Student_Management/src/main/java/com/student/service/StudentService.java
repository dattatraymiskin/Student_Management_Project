package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {
   
	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public Student getStudentById(Long id);
	
	public void deleteStudent(Long id);
}
