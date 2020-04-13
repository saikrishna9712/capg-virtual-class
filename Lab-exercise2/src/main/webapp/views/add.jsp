<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Traniee</title>
</head>
<body>
<h1>Enter Traniee Details</h1>
<form action="add" method="post">
<table>
<tr><td>Traniee Id</td>
<td><input type="number" name="tranieeId"></td></tr>
<tr><td>Traniee Name</td>
<td><input type="text" name="tranieeName"></td></tr>
<tr><td>Traniee Location</td>
<td>
<input type="radio" name="tranieeLocation" value="Chennai" id="Chennai">
<label for="Chennai">Chennai</label>
<input type="radio" name="tranieeLocation" value="Bangalore" id="Bangalore">
<label for="Bangalore">Bangalore</label>
<input type="radio" name="tranieeLocation" value="Pune" id="Pune">
<label for="Pune">Pune</label>
<input type="radio" name="tranieeLocation" value="Mumbai" id="Mumbai">
<label for="Mumbai">Mumbai</label>

</td></tr>
<tr><td>Traniee Domain</td>
<td><select id="tranieeDomain" name="tranieeDomain">
<option>please select</option>
<option value="JEE">JEE</option>
<option value=".NET">.NET</option>
<option value="Mainframe">Mainframe</option>
</select>
</td></tr>
<tr><button type="submit">Add Traniee</button></tr>
</table>

</form>

</body>
</html>