package org.noticeBoard.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	
	@Id
	@Column(name="teacher_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	public Teacher() {
		super();
	}
	
	public Teacher(int teacherId, String name, String email) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.email = email;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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
		return "Teacher [teacherId=" + teacherId + ", name=" + name + ", email=" + email + "]";
	}
	

}
