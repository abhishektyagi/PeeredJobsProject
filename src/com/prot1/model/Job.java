package com.prot1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Job {
	private int jobId;
	private String jobcode;
	private String title;
	private String owner;
	private String industry;
	private String category;
	private String subCategory;
	private String role;
	private boolean state;
	private String description;
	private Timestamp time;
	public Job(){}
	
	public void setJobId(int jobId){
		this.jobId= jobId;
	}
	public int getJobId(){
		return this.jobId;
	}
	
	public void setJobcode(String jobcode) {
		this.jobcode = jobcode;
	}
	public String getJobcode() {
		return jobcode;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getIndustry() {
		return industry;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public boolean getState() {
		return state;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	
	
	public boolean createJob(Job job){
		boolean status= false;
		Connection conn = null;
		PreparedStatement pStatement=null;
		String sql;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ProtoV1","root","neuro@RD350");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql ="insert job (jobcode, title, owner, industry, category, subcategory, role, state, description) " +
				"values (?,?,?,?,?,?,?,?,?)";
		try {
			pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, job.getJobcode());
			pStatement.setString(2,job.getTitle());
			pStatement.setString(3,job.getOwner());
			pStatement.setString(4,job.getIndustry());
			pStatement.setString(5,job.getCategory());
			pStatement.setString(6, job.getSubCategory());
			pStatement.setString(7, job.getRole());
			pStatement.setBoolean(8, job.getState());
			pStatement.setString(9, job.getDescription());
			
			ResultSet rs= pStatement.executeQuery();
			status=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return status;
		
	}
	
	public void retreiveJob(String userName){
		Connection conn = null;
		String sql;
		PreparedStatement pStat;
		ResultSet rs=null;
		//Job job = new Job();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ProtoV1","root","neuro@RD350");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql="select * from job where owner = ?";
		try {
			pStat = conn.prepareStatement(sql);
			pStat.setString(1, userName);
			rs= pStat.executeQuery();
			while(rs.next())
			{
				this.setJobId(rs.getInt(1));
				this.setJobcode(rs.getString(2));
				this.setTitle(rs.getString(3));
				this.setOwner(rs.getString(4));
				this.setIndustry(rs.getString(5));
				this.setCategory(rs.getString(6));
				this.setSubCategory(rs.getString(7));
				this.setRole(rs.getString(8));
				this.setState(rs.getBoolean(9));
				//this.setTimeStramp(rs.getTimestamp(11));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @param time the time to set
	 */
	public void setTimeStramp(Timestamp time) {
		this.time = time;
	}

	/**
	 * @return the time
	 */
	public Timestamp getTimeStamp() {
		return time;
	}
	

}
