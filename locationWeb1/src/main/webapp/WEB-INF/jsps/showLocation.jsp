<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>location</title>
</head>
<body>

<h2>enter location here</h2>
<form action="saveLocation" method="post">
<pre>
id<input type="text" name="id">
code<input type="text" name="code">
name<input type="text" name="name"> 
type: rural<input type="radio" name=type value="rural">
		urban:<input type="radio" name="type" value="urban">
		<input type="submit" value="save">
</pre>
</form>
<p style="color:green">
${msg}
</p>
<a href="getLocation">click here to view all location</a>
</body>
</html>