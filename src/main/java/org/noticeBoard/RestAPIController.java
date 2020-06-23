package org.noticeBoard;

import java.util.List;

import org.noticeBoard.entities.Notice;
import org.noticeBoard.entities.Student;
import org.noticeBoard.entities.Teacher;
import org.noticeBoard.services.NoticeService;
import org.noticeBoard.services.StudentService;
import org.noticeBoard.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

	@Autowired
	TeacherService teacherService;
	@Autowired
	StudentService studentService;
	@Autowired
	NoticeService noticeService;

	
//For Testing Purpose	
	
//	@RequestMapping("/hello")
//	public String hello() {
//		System.out.println("HEY");
//		return "HELLO";
//	}

	@RequestMapping(value = "/getAllNotice/{teacherId}", method = RequestMethod.GET)
	public List<Notice> getAllNoticeByTeacher(@PathVariable int teacherId) {
		return noticeService.getAllNoticeByTeacher(teacherId);
	}

	@RequestMapping(value = "/getNotice/{noticeId}", method = RequestMethod.GET)
	public Notice getNoticeById(@PathVariable int noticeId) {
		return noticeService.getNoticeById(noticeId);
	}

	@RequestMapping(value = "/teacher/{email}", method = RequestMethod.GET)
	public Teacher getTeacherByEmail(@PathVariable String email) {
		return teacherService.getTeacherByEmail(email);
	}

	@RequestMapping(value = "/teacher/addTeacher", method = RequestMethod.POST)
	public void addTeacher(@RequestBody Teacher teacher) {
		teacherService.addTeacher(teacher);
	}

	@RequestMapping(value = "/teacher/addNotice", method = RequestMethod.POST)
	public void addNoticeByTeacher(@RequestBody Notice notice) {
		noticeService.addNoticeByTeacher(notice);
	}

	@RequestMapping(value = "/teacher/updateNotice", method = RequestMethod.PUT)
	public void updateNoticeByTeacher(@RequestBody Notice notice) {
		noticeService.updateNoticeByTeacher(notice);
	}

	@RequestMapping(value = "/teacher/deleteNotice/{noticeId}", method = RequestMethod.DELETE)
	public void deleteNoticeByTeacher(@PathVariable int noticeId) {
		noticeService.deleteNoticeByTeacher(noticeId);
	}

	@RequestMapping(value = "/student/addStudent", method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}

	@RequestMapping(value = "/student/{email}", method = RequestMethod.GET)
	public Student getStudentByEmail(@PathVariable String email) {
		return studentService.getStudentByEmail(email);
	}

}
