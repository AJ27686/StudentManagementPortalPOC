package com.bct.app.dto;

import javax.persistence.*;

@Entity
@Table(name="branch_info")
public class BranchInfo {


	@OneToOne(targetEntity = StudentInfo.class)
	StudentInfo studentInfo;
	
	
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="branch_code")
	private int branchCode;
	
	@Column(name="hod_name")
	private String hodName;

	public StudentInfo getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	
	
}
