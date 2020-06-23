package org.noticeBoard.services;

import org.noticeBoard.entities.Student;
import org.noticeBoard.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	public void addStudent(Student student) {
		studentRepo.save(student);
		
	}

	public Student getStudentByEmail(String email) {
		return studentRepo.getStudentByEmail(email);
	}

}
