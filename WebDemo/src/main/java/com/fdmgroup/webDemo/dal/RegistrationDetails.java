package com.fdmgroup.webDemo.dal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WEBDEMO_REGDETAILS")

public class RegistrationDetails {

	@Id
	private String userName;
	@Column
	private String password;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String gender;
	@Column
	private String hobbies;
	public RegistrationDetails() {
		super();
	}
	public RegistrationDetails(String userName, String password, String firstName, String lastName, String gender,
			String hobbies) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hobbies = hobbies;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
	
	
}
