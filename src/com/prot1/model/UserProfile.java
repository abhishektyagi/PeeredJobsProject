package com.prot1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserProfile {
	public static User retrieveProfile(String username){
		User user = new User();
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProtoV1","root","neuro@RD350");
			String sql = "select * from userprofile where userid = ?";

			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, username);

			ResultSet rs = pStmt.executeQuery();
			if(rs.next())
			{
				user.setUserName(username);
				user.setFirstName(rs.getString(2));
				user.setLastName(rs.getString(3));
				user.setSex(rs.getString(4));
				user.setBirthday(rs.getString(5));
				user.setCity(rs.getString(6));
				user.setState(rs.getString(7));
				user.setCountry(rs.getString(8));
				user.seteMail(rs.getString(9));
				user.setCompany(rs.getString(10));
				user.setDesignation(rs.getString(11));
				user.setRole(rs.getString(12));
				
			}
			
			
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
		}
		
		return user;
		
		
	}

}
