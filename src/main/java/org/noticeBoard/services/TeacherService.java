package org.noticeBoard.services;

import org.noticeBoard.entities.Teacher;
import org.noticeBoard.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepo;

	public void addTeacher(Teacher teacher) {
		teacherRepo.save(teacher);
		
	}

	public Teacher getTeacherByEmail(String email) {
		return teacherRepo.getTeacherByEmail(email);
	}

}
