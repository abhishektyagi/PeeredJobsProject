package com.prot1.model;

import java.util.Date;

public class UserJob {
	private String title;
	private String role;
	private String category;
	private String company;
	private String officialEMailId;
	private Date startDate;
	private UserJob userJob;
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param officialEMailId the officialEMailId to set
	 */
	public void setOfficialEMailId(String officialEMailId) {
		this.officialEMailId = officialEMailId;
	}
	/**
	 * @return the officialEMailId
	 */
	public String getOfficialEMailId() {
		return officialEMailId;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param userJob the userJob to set
	 */
	public void setUserJob(UserJob userJob) {
		this.userJob = userJob;
	}
	/**
	 * @return the userJob
	 */
	public UserJob getUserJob() {
		return userJob;
	}
	

}
