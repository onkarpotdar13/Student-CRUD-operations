package com.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "studentId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "studentName")
	private String name;

	@Column(name = "studentAge")
	private int age;

	@Column(name = "studentRollNumber")
	private int rollNumber;

	@Column(name = "studentGender")
	private String gender;

	public Student() {
		
	}
	
	public Student(int id, String name, int age, int rollNumber, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", gender="
				+ gender + "]";
	}

}
