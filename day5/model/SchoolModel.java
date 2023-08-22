package com.skcet.day5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="SchoolModel")
public class SchoolModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int schoolId;
	@Column(name="SchoolModel")
private String schoolName;
private String schoolAddress;
private String schoolGroup;
public int getSchoolId() {
	return schoolId;
}
public void setSchoolId(int schoolId) {
	this.schoolId = schoolId;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public String getSchoolAddress() {
	return schoolAddress;
}
public void setSchoolAddress(String schoolAddress) {
	this.schoolAddress = schoolAddress;
}
public String getSchoolGroup() {
	return schoolGroup;
}
public void setSchoolGroup(String schoolGroup) {
	this.schoolGroup = schoolGroup;
}
}
