<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Cart</title>
</head>
<body>
<jsp:useBean id="addCartObj" class="com.dhanashri.beans.AddCartBean"/>
<jsp:setProperty name="addCartObj" property="bookIds" param ="books"/>
${addCartObj.addToCart()}

    <jsp:forward page="subjects.jsp">
		<jsp:param name="cart_count" value="${cb.bookList.size()}"/>
	</jsp:forward>


</body>
</html>