 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>
		<font size="50" color="blue">Login</font>
	</h1>
	<c:if test="${not empty error}">
		<h3><font size="30" color="red">${error}</font></h3>
	</c:if>
	<!-- <form action= "https://login.yahoo.com/?.src=ym&.intl=us&.lang=en-US&.done=https%3A%2F%2Fmail.yahoo.com" method="get">  -->
	<form action= "logindemo" method="get">
		User Name : <input type="text" name="username" /> 
		Password : <input type="password" name="password" /> 
		<input type="submit" name="Login" value="Login" />
	</form>
	
</body>
</html>