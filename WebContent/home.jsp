<%@page import="com.prot1.model.Job"%>
<%@page import="com.prot1.controller.register.User"%>
<%@page import="com.prot1.model.UserProfile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%
if(session.getAttribute("username")!=null){
	out.println("hello"+session.getAttribute("username"));
	String username=session.getAttribute("username").toString();
	//String username=request.getParameter("username");
	User user = UserProfile.retrieveProfile(username);
	
	out.println("<div><a href=\"JobPosting.jsp\" title=\"Register\" target=\"_self\">Post a Job</a></div>");
	out.println("User Profile");
	
%>
<table>
<tr><td><%out.println(user.getFirstName());out.println(user.getLastName()); %></td></tr>
<tr><td><%out.println(user.getCompany()); %></td></tr>
<tr><td><%out.println(user.getDesignation()); %></td></tr>
<tr><td><%out.println(user.getCity()); %></td></tr>

</table>
<%
	//Here I need a table.
	out.println("<p> Job Posted");
Job job= new Job();
job.retreiveJob(username);
%>
<table>
<tr><td> <% out.println(job.getJobcode());%> </td></tr>
<tr><td> <% //out.println(job.getJobId());%> </td></tr>
<tr><td> <% out.println(job.getOwner());%> </td></tr>
<tr><td> <% out.println(job.getRole());%> </td></tr>
<tr><td> <% out.println(job.getTimeStamp());%> </td></tr>
</table>

<%
	
	// Here also a table will be reqired.
	
}
else{
	response.sendRedirect("error.jsp");
}
%>
</body>
</html>