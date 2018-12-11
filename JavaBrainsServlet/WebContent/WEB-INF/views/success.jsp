<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful</title>
</head>
<body>
You are successfully authorized.
You are ${profession} by profession.
Your location is ${sessionScope.location}.
<% String username = (String)request.getSession().getAttribute("userName"); %>
<input type="text" value="<%=username %>" />
</body>
</html>