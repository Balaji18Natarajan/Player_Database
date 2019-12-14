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
<p>Please Enter the Details of the Player</p>
<form name="myForm" action="Resultsfull" method="post">
	<table>
		<tbody>
		<tr>
			<td>Player ID</td>
			<td><input type="number" name="id" value="" size="50" /></td>
		</tr>
		</tbody>
	</table>
	<input type="reset" value="clear" name="clear" />
	<input type="submit" value="submit" name="submit" />
</form>
</body>
</html>