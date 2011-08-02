package com.prot1.model;

public class User {
	 private String firstName;
	 private String lastName;
	 private String userName;
	 private String sex;
	 private String birthday;// TODO to be converted to date object
	 private String city;
	 private String state;
	 private String country;
	 private String eMail;
	 private String company;
	 private String designation;
	 private String role;
	 private String password;
	 
	 public User(){
		 
	 }
	 
	 public User( String firstName,	 String lastName, String userName,String sex,String birthday, String city,
	 String state, String country, String eMail, String company, String designation, String role){
		 this.setFirstName(firstName);
		 this.setLastName(lastName);
		 this.setUserName(userName);
		 this.setSex(sex);
		 this.setBirthday(birthday);
		 this.setCity(city);
		 this.setState(state);
		 this.setCountry(country);
		 this.seteMail(eMail);
		 this.setCompany(company);
		 this.setDesignation(designation);
		 this.setRole(role);
		 
	 }

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String geteMail() {
		return eMail;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

}
