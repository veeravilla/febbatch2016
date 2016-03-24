<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="scripts/lib.js"/></script>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1><font color="red">${error}</font></h1>
	<form action="mvc/sendData" method="post">
		<h1>User Name :  <input type="text" name="username"/></h1><br/>
	    <h1>Password :  <input type="password" name="password"/></h1><br/>
	    <input type="submit" value="Login"/></br>
	</form>
</body>
</html>