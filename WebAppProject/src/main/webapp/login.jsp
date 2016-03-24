<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="scripts/lib.js"/></script>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1><font color="red">${error}</font></h1>
	<form action="https://login.yahoo.com/?.src=ym&.intl=us&.lang=en-US&.done=https%3A%2F%2Fmail.yahoo.com" method="post">
		<h1>User Name :  <input type="text" name="username"/></h1><br/>
	    <h1>Password :  <input type="password" name="passwd"/></h1><br/>
	    <input type="submit" value="Login"/></br>
	</form>
</body>
</html>