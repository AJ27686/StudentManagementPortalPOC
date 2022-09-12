package com.bct.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bct.app.dto.BranchInfo;
import com.bct.app.dto.StudentInfo;
import com.bct.app.service.StudentInfoService;

@RestController
@RequestMapping("/student/info")
public class StudentInfoController {

	@Autowired
	StudentInfoService studentInfoService;
	
	@PostMapping(path="/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveStudent(@RequestBody StudentInfo student) {
		studentInfoService.saveStudent(student);
	}
	
	@GetMapping(path="/get",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StudentInfo> getStudentInfo() {
		return studentInfoService.getStudentInfo();
	}
	
}
