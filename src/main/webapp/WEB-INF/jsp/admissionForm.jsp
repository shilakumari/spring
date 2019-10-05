<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:errors path="emp.*" />
	<h6>Header Message: ${headerMessage}</h6>
	<form action="submitAdmissionForm.html" method="get">
		<h2>ADMISSION FORM</h2>
		<p>
			Student name:<input type="text" name="studentName" />
		</p>
		<p>
			Student hobby:<input type="text" name="studentHobby" />
		</p>
		<input type="submit" />
	</form>
	<br>
	<form action="submitAdmissionForm2.html" method="get">
		<h2>ADMISSION FORM2</h2>
		<p>
			Student name:<input type="text" name="studentName" />
		</p>
		<p>
			Student hobby:<input type="text" name="studentHobby" />
		</p>
		<input type="submit" />
	</form>

	<form action="submitAdmissionForm3.html" method="get">
		<h2>ADMISSION FORM3</h2>
		<p>
			Student name:<input type="text" name="studentName" />
		</p>
		<p>
			Student hobby:<input type="text" name="studentHobby" />
		</p>
		<input type="submit" />
	</form>
	<form action="submitAdmissionForm4.html" method="get">
		<h2>ADMISSION FORM4</h2>
		<p>
			Student name:<input type="text" name="studentName" />
		</p>
		<p>
			Student hobby:<input type="text" name="studentHobby" />
		</p>
		<input type="submit" />
	</form>
	<form action="submitAdmissionForm5.html" method="get">
		<h2>ADMISSION FORM5</h2>
		<p>
			Student name:<input type="text" name="studentName" />
		</p>
		<p>
			Student hobby:<input type="text" name="studentHobby" />
		</p>
		<input type="submit" />
	</form>


	<form action="submitAdmissionForm6.html" method="get">
		<h2>ADMISSION FORM 6</h2>
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

	<form action="submitAdmissionForm7.html" method="get">
		<h2>ADMISSION FORM 7</h2>
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


	<form action="submitAdmissionForm8.html" method="get">
		<h2>ADMISSION FORM 8</h2>
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


	<form action="submitAdmissionForm9.html" method="get">
		<h2>ADMISSION FORM 9</h2>
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