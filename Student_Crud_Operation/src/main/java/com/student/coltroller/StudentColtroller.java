package com.student.coltroller;

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

import com.student.entity.Student;
import com.student.services.StudentService;


@RestController
@RequestMapping("/student")
public class StudentColtroller {
	
	@Autowired
	private StudentService studentService;
	
//	select user by GET call
	@GetMapping("selectStudent")
	public List<Student> selectAllStudent(){
		return studentService.selectAllUser();
	}

//	insert user by POST call
	@PostMapping("/insertStudent")
	public Student insertStudent(@RequestBody Student student) {
		return studentService.insertStudent(student);
	}
	
//	delete user by DELETE call
	@DeleteMapping("/deleteStudent/{studentId}")
	public String deleteStudentById(@PathVariable Integer studentId) {
		return studentService.deleteStudentById(studentId);
	}
	
//	update user by PUT call
	@PutMapping("/updateStudent/{studentId}")
	public Student updateStudent(@RequestBody Student student, @PathVariable Integer studentId) {
		return studentService.updateStudentById(student, studentId);
	}
	
}
