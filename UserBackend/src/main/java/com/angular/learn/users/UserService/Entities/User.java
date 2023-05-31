package com.angular.learn.users.UserService.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_table")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int developerId;
	
	@Column(name = "Name")
	private String developerName;
	
	@Column(name = "Roles")
	private String developerRoles;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Salary")
	private String salary;

	public int getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public String getDeveloperRoles() {
		return developerRoles;
	}

	public void setDeveloperRoles(String developerRoles) {
		this.developerRoles = developerRoles;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [developerId=" + developerId + ", developerName=" + developerName + ", developerRoles="
				+ developerRoles + ", location=" + location + ", email=" + email + ", salary=" + salary
				+ ", getDeveloperId()=" + getDeveloperId() + ", getDeveloperName()=" + getDeveloperName()
				+ ", getDeveloperRoles()=" + getDeveloperRoles() + ", getLocation()=" + getLocation() + ", getEmail()="
				+ getEmail() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public User(int developerId, String developerName, String developerRoles, String location, String email,
			String salary) {
		super();
		this.developerId = developerId;
		this.developerName = developerName;
		this.developerRoles = developerRoles;
		this.location = location;
		this.email = email;
		this.salary = salary;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
