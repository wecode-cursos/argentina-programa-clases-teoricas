<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome!</title>
</head>
<body>

Welcome, <%= session.getAttribute("username") %>
<br>
<a href="logout">logout</a>

</body>
</html>