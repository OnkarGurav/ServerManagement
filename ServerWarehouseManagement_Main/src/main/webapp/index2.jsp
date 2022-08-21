<html>
<body>
<h1>Welcome in Registration Module</h1>

<h2>Register New User here</h2><br>

<form action="api/user" method="post">
User Id : <input name="userId" type="text"><br>
<br></br>
User Name : <input name="username" type="text"><br>
<br></br>
Password : <input name="password" type="text"><br>
<br></br>
	<label for="cars">Select User Type :</label>
  	<select name="userType" id="User Type">
    <option value="admin">admin</option>
    <option value="regular">regular</option>
    <option value="help_desk">help_desk</option>
    <option value="team_leader">team_leader</option>
  </select>
	<br></br>
Mobile Number : <input name="mobilenum" type="text"><br>
<br></br>
DepartMent : <input name="department" type="text"><br>
<input value="Sign Up" type="submit">
</form>
</body>
</html>
