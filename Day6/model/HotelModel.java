package com.example.Day6.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class HotelModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int hotelId;
@Column(name="hotelmodel")
private String hotelName;
private String hotelAddress;
private String category;
private String phnNo;
public int getHotelId() {
	return hotelId;
}
public void setHotelId(int hotelId) {
	this.hotelId = hotelId;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public String getHotelAddress() {
	return hotelAddress;
}
public void setHotelAddress(String hotelAddress) {
	this.hotelAddress = hotelAddress;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getPhnNo() {
	return phnNo;
}
public void setPhnNo(String phnNo) {
	this.phnNo = phnNo;
}
}
