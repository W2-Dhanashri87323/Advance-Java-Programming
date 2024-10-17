<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subjects</title>
</head>
<body>
	<h2>Subjects</h2>

	<jsp:useBean id="subObj" class="com.dhanashri.beans.SubjectsBean" />
	${subObj.fetchSubjects()}

	<form action="Books.jsp" method="post">

		<c:forEach var="sub" items="${subObj.subjects}">
			<input type="radio" name="subject" value= "${sub}"/> ${sub} <br>
		</c:forEach>
		<input type="submit" value="Show Books">
		<p>
			<a href="showcart.jsp">Show Cart</a>
		</p>

	</form>
</body>
</html>