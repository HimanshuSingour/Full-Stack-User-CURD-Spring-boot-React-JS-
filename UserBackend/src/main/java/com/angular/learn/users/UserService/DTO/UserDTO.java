package com.angular.learn.users.UserService.DTO;

public class UserDTO {
	
	private int developerId;

	private String developerName;

	private String developerRoles;

	private String location;

	private String email;
	
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
		return "UserDTO [developerId=" + developerId + ", developerName=" + developerName + ", developerRoles="
				+ developerRoles + ", location=" + location + ", email=" + email + ", salary=" + salary
				+ ", getDeveloperId()=" + getDeveloperId() + ", getDeveloperName()=" + getDeveloperName()
				+ ", getDeveloperRoles()=" + getDeveloperRoles() + ", getLocation()=" + getLocation() + ", getEmail()="
				+ getEmail() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public UserDTO(int developerId, String developerName, String developerRoles, String location, String email,
			String salary) {
		super();
		this.developerId = developerId;
		this.developerName = developerName;
		this.developerRoles = developerRoles;
		this.location = location;
		this.email = email;
		this.salary = salary;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
