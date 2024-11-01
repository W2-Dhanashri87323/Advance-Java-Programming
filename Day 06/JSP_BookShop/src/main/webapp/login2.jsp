<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>


<jsp:useBean id="lb" class ="com.dhanashri.beans.LoginBean" scope="session"></jsp:useBean>
<jsp:setProperty  name="lb" property="*"/>
${lb.authenticate()}


<c:choose>
  <c:when test="${not empty lb.cust }">
     <c:redirect url="subjects.jsp" />
  </c:when>
  <c:otherwise>
     Invalid email or password.
     <p>
     <a href = "login1.jsp"> Login Again</a>
     </p>
  </c:otherwise>

</c:choose>
</body>
</html>