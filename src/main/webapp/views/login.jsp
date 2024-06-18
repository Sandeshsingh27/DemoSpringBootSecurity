<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>LogIn</h1>

${SPRING_SECURITY_LAST_EXCEPTION.message} <!-- Displays any authentication error message -->

<form action = "login" method = "post">
User : <input type = "text" name = "username" value = '' /><br>
Password : <input type = "password" name = "password" /><br>

<input type = "submit" value = "submit" /><br>
</form>

</body>
</html>