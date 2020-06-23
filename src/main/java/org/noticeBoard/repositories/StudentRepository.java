package org.noticeBoard.repositories;


import org.noticeBoard.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	@Query("select s from Student s where s.email= ?1")
	Student getStudentByEmail(String email); 

}
