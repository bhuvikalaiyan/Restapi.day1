package com.example.Day9.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class PersonModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stuid")
	private int stuId;
	private String stuName;

	//@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="address",referencedColumnName = "stuid")
	private List<Address> stuAddr;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public List<Address> getStuAddr() {
		return stuAddr;
	}

	public void setStuAddr(List<Address> stuAddr) {
		this.stuAddr = stuAddr;
	}
}
