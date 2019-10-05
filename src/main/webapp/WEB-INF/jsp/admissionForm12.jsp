<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
	<a href="admissionForm12.html?siteLanguage=en">English</a>
	<a href="admissionForm12.html?siteLanguage=fr">French</a>
	<form action="submitAdmissionForm11.html" method="get">
		<h2>ADMISSION FORM 12</h2>
		<table>
			<tr>
				<td><spring:message code="label.name" /></td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.hobby" /></td>
				<td><input type="text" name="hobby" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.mobile" /></td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.dob" /></td>
				<td><input type="text" name="dob" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.skills" /></td>
				<td><select name="skills" multiple>
						<option value="JavaCore">Java Core</option>
						<option value="SpringCore">Spring Core</option>
						<option value="SpringMVC">Spring MVC</option>
				</select></td>
			</tr>
			<tr>
				<td><spring:message code="label.departments" /></td>
				<td><select name="departments" multiple>
						<option value="IT">IT</option>
						<option value="Admin">Admin</option>
						<option value="Sales">Sales</option>
				</select></td>
			</tr>

			<tr>
				<td><spring:message code="label.address" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.country" /></td>
				<td><input type="text" name="address.country" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.city" /></td>
				<td><input type="text" name="address.city" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.street" /></td>
				<td><input type="text" name="address.street" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.pincode" /></td>
				<td><input type="text" name="address.pincode" /></td>
			</tr>

			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>


</body>

</html>