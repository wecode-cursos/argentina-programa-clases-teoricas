<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<% 
String flash = (String) request.getAttribute("flash");
%>

<% if (flash != null) { %>
<strong><%= flash %></strong>
<% } %>

<form action="login" method="post">
	username: <input name="username"/>
	<br>
	password: <input type="password" name="password"/>
	<br>
	<button type="submit">login</button>
</form>

</body>
</html>