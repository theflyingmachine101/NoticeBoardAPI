package org.noticeBoard.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	
	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	public Student() {
		super();
	}
	
	

	public Student(int studentId, String name, String email) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.email = email;
	}



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
