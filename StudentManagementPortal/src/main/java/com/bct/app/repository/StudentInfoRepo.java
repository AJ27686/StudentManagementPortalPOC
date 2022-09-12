package com.bct.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bct.app.dto.StudentInfo;

@Repository
public interface StudentInfoRepo extends JpaRepository<StudentInfo, Integer>{

}
