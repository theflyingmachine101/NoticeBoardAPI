package org.noticeBoard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.noticeBoard.entities.Notice;
import org.noticeBoard.repositories.NoticeRepository;


@Service
public class NoticeService {
	
	@Autowired
	NoticeRepository noticeRepo;
	
	public List<Notice> getAllNoticeByTeacher(int id)
	{
	return 	noticeRepo.getAllNoticeByTeacher(id);
	
	}

	public void addNoticeByTeacher(Notice notice) {
		noticeRepo.save(notice);
	}

	public void updateNoticeByTeacher(Notice notice) {
		noticeRepo.save(notice);
		
	}

	public void deleteNoticeByTeacher(int noticeId) {
		noticeRepo.deleteById(noticeId);
	}

	public Notice getNoticeById(int noticeId) {
		return noticeRepo.findById(noticeId).get();
	}


}
