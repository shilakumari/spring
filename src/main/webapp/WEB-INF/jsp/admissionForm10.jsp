<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
	<form action="submitAdmissionForm10.html" method="get">
		<h2>ADMISSION FORM 10</h2>
		<table>
			<tr>
				<td>Employee name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			
		<tr>
				<td>Employee hobby:</td>
				<td><input type="text" name="hobby" /></td>
			</tr>
			<tr>
				<td>Employee mobileNo:</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td>Employee DOB:</td>
				<td><input type="text" name="dob" /></td>
			</tr>
			<tr>
				<td>Employee Skills:</td>
				<td><select name="skills" multiple>
						<option value="JavaCore">Java Core</option>
						<option value="SpringCore">Spring Core</option>
						<option value="SpringMVC">Spring MVC</option>
				</select></td>
			</tr>
			<tr>
				<td>Employee Departments:</td>
				<td><select name="departments" multiple>
						<option value="IT">IT</option>
						<option value="Admin">Admin</option>
						<option value="Sales">Sales</option>
				</select></td>
			</tr>

			<tr>
				<td>Employee Address:</td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><input type="text" name="address.country" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="address.city" /></td>
			</tr>
			<tr>
				<td>Street:</td>
				<td><input type="text" name="address.street" /></td>
			</tr>
			<tr>
				<td>Pincode:</td>
				<td><input type="text" name="address.pincode" /></td>
			</tr>

			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>


</body>

</html>