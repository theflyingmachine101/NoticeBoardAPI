package org.noticeBoard.repositories;

import java.util.List;

import org.noticeBoard.entities.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface NoticeRepository extends CrudRepository<Notice, Integer>{

	
	@Query("select n from Notice n where n.teacherId = ?1")
	List<Notice> getAllNoticeByTeacher(int id);
}
