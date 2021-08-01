<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update location</title>
</head>
<body>
	<h2>update location here</h2>
<form action="updateLocationData" method="post">
<pre>
id<input type="text" name="id" value="${location.id}" readonly>
code<input type="text" name="code" value="${location.code}">
name<input type="text" name="name" value="${location.name}"> 
type: rural<input type="radio" name=type value="rural">
		urban:<input type="radio" name="type" value="urban">
		<input type="submit" value="save">
</pre>
</form>
</body>
</html>