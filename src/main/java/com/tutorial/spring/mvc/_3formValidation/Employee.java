package com.tutorial.spring.mvc._3formValidation;

import java.util.Date;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	@Pattern(regexp="(^0-9)*")
	private String name;
	//@Size(min = 2, max = 20, message = "Please enter the value of employee hobby field between 2 to 20 characters")
	//@Size(min = 2, max = 20, message = "Please enter the value of employee hobby field between {min} to {max} characters")
	@Size(min = 2, max = 20)
	private String hobby;

	@Max(2222)
	private Long mobile;
	@Past//To bind an error message for the future dob value
	private Date dob;
	private List<String> skills;
	private String departments;

	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}