package com.eduramp.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.eduramp.demo.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findByName(String name); // select * from student s where s.name=?;

	public List<Student> findByAddress(String address);

	public List<Student> findByNameAndAddress(String name, String address);

	public List<Student> findByNameOrAddress(String name, String address);

	@Query(value = "from Student")
	public List<Student> getAllStudents();

	@Query(value = "select * from student", nativeQuery = true) 
	public List<Student> getAllStudentsUsingSqlQuery();

}
