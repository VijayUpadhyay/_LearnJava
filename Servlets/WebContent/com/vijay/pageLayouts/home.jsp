<%@page import="com.vijay.pojo.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%UserDetails user = (UserDetails) session.getAttribute("User"); %>
<h3>Hi <%= user.getUserName() %></h3>
<strong>Your Email</strong>: <%=user.getEmail() %><br>
<strong>Your Country</strong>: <%=user.getCountry() %><br>
<br>
<form action="Logout" method="post">
<input type="submit" value="Logout" >
</form>

</body>
</html>