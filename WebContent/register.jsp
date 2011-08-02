<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Register</title>
</head>
<body>
<form action="register.do" method="post" enctype="application/x-www-form-urlencoded" name="Registeration" target="_self">
<table width="294" border="0">
  <tr>
    <td width="115">First Name&nbsp;</td>
    <td width="163"><input type="text" name="firstname" id="firstname" /></td>
  </tr>
  <tr>
    <td>Last Name&nbsp;</td>
    <td><input type="text" name="lastname" id="lastname" /></td>
  </tr>
  <tr>
    <td>Username</td>
    <td><input type="text" name="username" id="username" /></td>
  </tr>
    <tr>
    <td>Sex</td>
    <td><input type="radio" name="sex" id="sex" value="M" />
      M
        <input type="radio" name="sex" id="sex2" value="F" />
        F</td>
  </tr>
  <tr>
    <td>Birthday</td>
    <td><select name="day" id="day">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
      <option>6</option>
      <option>7</option>
      <option>8</option>
      <option>9</option>
      <option>10</option>
      <option>11</option>
      <option>12</option>
      <option>13</option>
      <option>14</option>
      <option>15</option>
      <option>16</option>
      <option>17</option>
    </select>
      <select name="month" id="month">
        <option>Jan</option>
        <option>Feb</option>
        <option>Mar</option>
        <option>Apr</option>
        <option>May</option>
        <option>Jun</option>
        <option>Jul</option>
        <option>Aug</option>
        <option>Sep</option>
        <option>Oct</option>
      </select></td>
  </tr>
  <tr>
    <td>City</td>
    <td><input type="text" name="city" id="city" /></td>
  </tr>
  <tr>
    <td>State</td>
    <td><input type="text" name="state" id="state" /></td>
  </tr>
  <tr>
    <td>Country</td>
    <td><input type="text" name="country" id="country" /></td>
  </tr>
  <tr>
    <td>Email</td>
    <td><input type="text" name="email" id="email" /></td>
  </tr>
  <tr>
    <td>Password</td>
    <td><input type="password" name="password" id="password" /></td>
  </tr>
  <tr>
    <td>Company</td>
    <td><input type="text" name="company" id="company" /></td>
  </tr>
  <tr>
    <td>Designation</td>
    <td><input type="text" name="designation" id="designation" /></td>
  </tr>
  <tr>
    <td>Role</td>
    <td><input type="text" name="role" id="role" /></td>
  </tr>
</table>
<input type="submit" value="Register !" name="submit" align="middle"/>

</form>


</body>
</html>
