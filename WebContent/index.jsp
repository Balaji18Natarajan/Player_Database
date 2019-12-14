<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Player Details</h1>
Please Enter the Details of the Player
<form name="myForm" action="results" method="post">
	<table>
		<tbody>
		<tr>
			<td>Player ID</td>
			<td><input type="number" name="id" value="" size="50" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="" size="50" /></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="number" name="age" value="" /></td>
		</tr>
		<tr>
			<td>Email ID</td>
			<td><input type="text" name="email" value="" size="50" /></td>
		</tr>
		<tr>
			<td>Sports Type</td>
			<td><input type="text" name="sports" value="" size="50" /></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><input type="text" name="address" value="" size="100" /></td>
		</tr>
		</tbody>
	</table>
	<input type="reset" value="clear" name="clear" />
	<input type="submit" value="submit" name="submit" />
	<a href="http://localhost/SimpleForm/Details.jsp">Get Player Details with ID</a>
	<a href="http://localhost/SimpleForm/Deletehome.jsp">Delete Player Details with ID</a>
</form>
</body>
</html>
