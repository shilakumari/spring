<html>
<body>
	<h1>${headerMessage}</h1>
	<h2>Congratulation! admission successfully</h2>
	<h3>Details submitted by you:</h3>
	<table>
		<tr>
			<td>Employee name:</td>
			<td>${emp.name}</td>
		</tr>
		<tr>
			<td>Employee hobby:</td>
			<td>${emp.hobby}</td>
		</tr>
		<tr>
			<td>Employee mobile:</td>
			<td>${emp.mobile}</td>
		</tr>
		<tr>
			<td>Employee dob:</td>
			<td>${emp.dob}</td>
		</tr>
		<tr>
			<td>Employee skills:</td>
			<td>${emp.skills}</td>
		</tr>
		<tr>
			<td>Employee departments:</td>
			<td>${emp.departments}</td>
		</tr>

		<tr>
			<td>Employee Address:</td>
			<td>Country:${emp.address.country} 
				City:${emp.address.city}
				Street:${emp.address.street} 
				Pin code:${emp.address.pincode}
			</td>
		</tr>

	</table>

</body>
</html>