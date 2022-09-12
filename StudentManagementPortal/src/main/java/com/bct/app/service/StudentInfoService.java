package com.bct.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bct.app.dto.BranchInfo;
import com.bct.app.dto.StudentInfo;
import com.bct.app.repository.StudentInfoRepo;

@Service
public class StudentInfoService {

	@Autowired
	StudentInfoRepo studentInfoRepo;

	public void saveStudent(StudentInfo student) {
		studentInfoRepo.save(student);
	}

	public List<StudentInfo> getStudentInfo() {
		return studentInfoRepo.findAll();
	}
	
	
	
}
