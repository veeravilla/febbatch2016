<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>
		<font size="50" color="blue">Student Portal</font>
	</h1>
	<c:if test="${not empty stuList}">
		<table border="3">
			<tr>
				<td>Sno</td>
				<td>Sname</td>
				<td>Fee</td>
				<td>Course</td>
				<td>ZipCode</td>
			</tr>
		
		<c:forEach items="${stuList}" var="student">
			<tr>
				<td>${student.sno}</td>
				<td>${student.sname}</td>
				<td>${student.fee}</td>
				<td>${stduentcourse}</td>
				<td>${student.zipCode} </td>
			</tr>
		</c:forEach>
		</table>
	</c:if>
</body>
</html>