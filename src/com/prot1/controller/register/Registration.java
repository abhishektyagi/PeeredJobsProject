package com.prot1.controller.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.prot1.model.User;


public class Registration {

	public static boolean register(User user) {
		PreparedStatement userEntryStatement=null;
		PreparedStatement userProfileEntryStatement=null;
		boolean confirmUserEntry=false;
		boolean confirmUserProfileEntry=false;
		String userEntry="insert into user values(?,?,?)";
		String userProfileEntry="insert into userprofile values (?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ProtoV1","root","neuro@RD350");
			userEntryStatement=conn.prepareStatement(userEntry);
			/**
			 * Entry for Table USER
			 */
			userEntryStatement.setString(1, user.getUserName());
			userEntryStatement.setString(2, user.geteMail());
			userEntryStatement.setString(3, user.getPassword());
			
			/**
			 * Entry for Table USERPROFILE
			 */
			userProfileEntryStatement=conn.prepareStatement(userProfileEntry);
		/*	System.out.println(user.getUserName());*/
			userProfileEntryStatement.setString(1, user.getUserName());
			userProfileEntryStatement.setString(2, user.getFirstName());
			userProfileEntryStatement.setString(3, user.getLastName());
			userProfileEntryStatement.setString(4, user.getSex());
			userProfileEntryStatement.setString(5, user.getBirthday());
			userProfileEntryStatement.setString(6, user.getCity());
			userProfileEntryStatement.setString(7, user.getState());
			userProfileEntryStatement.setString(8, user.getCountry());
			userProfileEntryStatement.setString(9, user.geteMail());
			userProfileEntryStatement.setString(10, user.getCompany());
			userProfileEntryStatement.setString(11, user.getDesignation());
			userProfileEntryStatement.setString(12, user.getRole());
			
			confirmUserEntry=userEntryStatement.execute();
			
			confirmUserProfileEntry=userProfileEntryStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(!conn.isClosed()){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(!(confirmUserProfileEntry&&confirmUserEntry)){
			return true;
		}
		else 
			return false;
		
	}
}


