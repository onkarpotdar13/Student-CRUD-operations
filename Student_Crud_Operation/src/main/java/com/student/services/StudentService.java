package com.student.services;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {
	
//	select user by GET call
	List<Student> selectAllUser();
	
//	insert user by POST call
	Student insertStudent(Student student);
	
//	delete user by DELETE call
	String deleteStudentById(Integer studentId);
	
//	update user by PUT call
	Student updateStudentById(Student student, Integer studentId);

}
