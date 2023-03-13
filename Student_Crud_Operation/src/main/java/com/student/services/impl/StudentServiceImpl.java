package com.student.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> selectAllUser() {
		 List<Student> students = studentRepository.findAll();
		 return students;
	}

	@Override
	public Student insertStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public String deleteStudentById(Integer studentId) {
		this.studentRepository.deleteById(studentId);
		return "Remove Student Details Successfully !!! -> " + studentId ;
	}

	@Override
	public Student updateStudentById(Student student, Integer studentId) {
		Student studentUpdate = this.studentRepository.findById(studentId).orElse(null);
		studentUpdate.setName(student.getName());
		studentUpdate.setRollNumber(student.getRollNumber());
		studentUpdate.setGender(student.getGender());
		studentUpdate.setAge(student.getAge());
		return studentRepository.save(studentUpdate);
	}

}
