package com.prot1.auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

public class Authenticate {

	public static boolean getAuthentication(String user, String password) {
		Connection conn=null;
		String authString="";
		PreparedStatement authStatement=null;
		ResultSet rs =null;
	//	Statement stmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		}
		try {
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ProtoV1","root","neuro@RD350");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("HERE");System.out.println("USER: "+user);System.out.println("PASS: "+password);
		/**UsernamePasswordToken token = new UsernamePasswordToken(user, password);
		token.setRememberMe(true);
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.login(token);*/
		authString="select * from user where userid = ? AND password = ? ";
		try {
			authStatement = conn.prepareStatement(authString);
			//stmt=conn.
			authStatement.setString(1, user);
			authStatement.setString(2, password);
			rs = authStatement.executeQuery();
			if(rs.next()){
				return true;
			}
			else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					authStatement.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		
		return false;
	}

}
