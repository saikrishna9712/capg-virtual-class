<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Traniee</title>
</head>
<body>

<form action="get-traniee" method="get">
<h1>Modify Operation</h1>
<table border="1px">
<tr><td>Please enter traniee ID</td>
<td><input type="number" name="tId"></td>
<td><button type="submit">Modify</button>
</tr>
</table>
</form>


<form action="update" method="post">
<h1>Traniee Info</h1>
<table border="1px">
<tr><td>Traniee Id</td>
<td><input type="number" name="tranieeId"></td></tr>
<tr><td>Traniee Name</td>
<td><input type="text" name="tranieeName"></td></tr>
<tr><td>Traniee Location</td>
<td><input type="text" name="tranieeLocation"></td></tr>
<tr><td>Traniee Domain</td>
<td><input type="text" name="tranieeDomain"></td></tr>
<tr align="right" ><button type="submit">update</button></tr>
</table>
</form>
</body>
</html>