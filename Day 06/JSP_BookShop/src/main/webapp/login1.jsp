<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

   <h2>Login</h2>
    
    <form action="login2.jsp" method="post">
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" placeholder="Enter your email" required><br><br>

        <label for="password">Password:</label><br>
        <input type="password" id="password" name="passwd" placeholder="Enter your password" required><br><br>

        <input type="submit" value="Login">
    </form>

    <p>Don't have an account? <a href="Registration.html">Sign up</a></p>



</body>
</html>