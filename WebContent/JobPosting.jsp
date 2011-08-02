<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post a Job</title>
</head>
<body>
<body>
<form id="jobposting" name="jobposting" method="post" action=""> 
<table width="265" border="1">
  <tr>
    <td width="105">Job Code</td>
    <td width="144">
      <input type="text" name="jobcode" id="jobcode" />
	</td>
  </tr>
  <tr>
    <td>Title</td>
    <td><input type="text" name="title" id="title" /></td>
  </tr>
  <tr>
    <td>Industry</td>
    <td><input type="text" name="industry" id="industry" /></td>
  </tr>
  <tr>
    <td>Category</td>
    <td><input type="text" name="category" id="category" /></td>
  </tr>
  <tr>
    <td>Specialization</td>
    <td><input type="text" name="subcategory" id="subcategory" /></td>
  </tr>
  <tr>
    <td>Role</td>
    <td><input type="text" name="role" id="role"/></td>
  </tr>
</table>
<p><label  >Job Description</label>
  &nbsp; 
  <label>
    <textarea name="description" id="description" cols="45" rows="5"></textarea>
  </label>
</p>
<input type="submit" value="Create Job" name ="submit" align="middle"/>
</form>

</body>

</body>
</html>