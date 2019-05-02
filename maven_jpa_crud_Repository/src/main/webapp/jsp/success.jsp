<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<script type="text/javascript">
function add1() {
	alert("in add new")
	document.myform.action="regi";
	document.myform.submit();
	
}

function Del1() {
	alert("in delet")
	document.myform.action="deleted";
	document.myform.submit();
	
}
function Edi1() {
	alert("in edit")
	document.myform.action="edited";
	document.myform.submit();
	
}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="myform">
<table >
<tr><th>id</th><th>name</th><th>adress</th><th>mobileno</th><th>username</th><th>password</th></tr>

<c:forEach items="${data}" var="s">
<tr>
<th><input type="radio" name="id" value="${s.id}"> </th>
<th><c:out value="${s.name}"></c:out></th>
<th><c:out value="${s.address}"></c:out></th>

<th><c:out value="${s.mobileno}"></c:out></th>
<th><c:out value="${s.username}"></c:out></th>
<th><c:out value="${s.password}"></c:out></th>
</tr>
</c:forEach>

</table>
<input type="submit" value="Add_New" name="add" onclick="add1()">
<input type="submit" value="Delet" name="del" onclick="Del1()">
<input type="submit" value="Edit" name="edi" onclick="Edi1()">

</form>

</body>
</html>