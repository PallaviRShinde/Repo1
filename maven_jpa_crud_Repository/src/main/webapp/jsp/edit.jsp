<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update"> 
<input type="hidden" value="${data.id}" name="id"> 
Name::<input type="text" name="name" value="${data.name}">
address::<input type="text" name="address" value="${data.address}">
mobileno::<input type="text" name="mobileno" value="${data.mobileno}">
username::<input type="text" name="username" value="${data.username}">
password::<input type="text" name="password" value="${data.password}">
<input type="submit" value="Edit">
</form>
</body>
</html>