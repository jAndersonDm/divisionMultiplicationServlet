<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Form</title>
</head>
<body>
<h1>Multiplication</h1>
<form action="getMultServlet" method="post">
Enter a number in both boxes and press submit to multiply them
<input type="text" name="mNumOne" size="10">
<input type="text" name="mNumTwo" size="10">
<input type="submit" value="Multiply Numbers" />
</form>

</body>
</html>