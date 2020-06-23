package org.noticeBoard.repositories;

import org.noticeBoard.entities.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

	
	@Query("select t from Teacher t where t.email= ?1")
	Teacher getTeacherByEmail(String email); 
}
