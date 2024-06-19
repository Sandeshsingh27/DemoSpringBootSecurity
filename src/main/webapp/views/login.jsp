<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

<h1>Login</h1>

<%-- Display error message if SPRING_SECURITY_LAST_EXCEPTION is not null --%>
<% if (request.getAttribute("SPRING_SECURITY_LAST_EXCEPTION") != null) { %>
    <p style="color: red;"><%= request.getAttribute("SPRING_SECURITY_LAST_EXCEPTION") %></p>
<% } %>

<form action="/login" method="post">
    User : <input type="text" name="username" /><br>
    Password : <input type="password" name="password" /><br>
    <input type="submit" value="Login" /><br>
</form>

</body>
</html>
