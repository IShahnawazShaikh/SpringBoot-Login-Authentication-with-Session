
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Spring Shop</title>
 <link href="css/style.css"
        rel="stylesheet">
</head>
<body>
<div class="main">
    <%@include file="header.jsp" %>
  <div class="content">
      <div class="displayDetail">
           <div class="update">
            
           <form action="logout" method="POST">
             
             <p> Name</p> 
            <input type="name" name="name" value="${userDetail.getUsername()}">
        	<br>
             <p>Email</p> 
            <input type="name" name="name" value="${userDetail.getEmail()}">
        	<br>
        	 <p> Phone</p> 
            <input type="name" name="name" value="${userDetail.getPhone()}">
        	<br>
        	<input type="submit" name="" value="Logout">
        	</form>
		 
        
		
	</div>
         </div> 
        
 </div>
 </div>

</body>
</html>