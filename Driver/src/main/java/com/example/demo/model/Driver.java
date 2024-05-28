package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driverId;
	private String fName;
	private String lName;
	private String dateOfBirth;
	private String address;
	private int pincode;
	private String adharCard;
	private long mobileNumber;
	private String username;
	private String password;
	private String emailId;
	private int age;
	private String gender;

//	private Policy policy;
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", fName=" + fName + ", lName=" + lName + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", pincode=" + pincode + ", adharCard=" + adharCard + ", mobileNumber="
				+ mobileNumber + ", username=" + username + ", password=" + password + ", emailId=" + emailId + ", age="
				+ age + ", gender=" + gender + "]";
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public Driver() {
		super();
	}

	public Driver(int driverId, String fName, String lName, String dateOfBirth, String address, int pincode,
			String adharCard, long mobileNumber, String username, String password, String emailId, int age,
			String gender) {
		super();
		this.driverId = driverId;
		this.fName = fName;
		this.lName = lName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.pincode = pincode;
		this.adharCard = adharCard;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
	}


}
