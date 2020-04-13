<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Traniee Data</title>
</head>
<body>
<form action="get-traniee" method="get">
<h1>Retrieve Operation</h1>
<table border="1px">
<tr><td>Please enter traniee ID</td>
<td><input type="number" name="tId"></td>
<td><button type="submit">delete</button>
</tr>
</table>
</form>


<form action="get-traniee" method="get">
<h1>Traniee Info</h1>
<table border="1px">
<tr>
<td>Traniee ID</td>
<td>Traniee Name</td>
<td>Traniee Location</td>
<td>Traniee Domain</td>
</tr>
<tr>
<td> ${traniee.tranieeId} </td>
<td> ${traniee.tranieeName} </td>
<td> ${traniee.tranieeLocation} </td>
<td> ${traniee.tranieeDomain} </td>
</tr>
</table>
</form>

</body>
</html>