<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
 <link href="css/style.css"
        rel="stylesheet">
</head>
<body>
  <div class="main">
    <%@include file="header.jsp" %>
  <div class="content">
  <div class="loginPage">
           <form action="profile" method="POST">
             <p>Username</p> 
            <input type="text" name="username">
        	<br>
        	  <p>Password</p>
        	<input type="password" name="password">
            <br>
        	<input type="submit" name="" value="login">
        	</form>
		<p>Don't have Account <a href="register">click</a></p>
	</div>
 </div>
 </div>
 
</body>
</html>