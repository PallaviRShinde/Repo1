<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>

<script type="text/javascript">
function add1()
{
	alert("Add")
	document.pal.action="jsp/registration.jsp";
	document.pal.submit();
	
}
function edit1()
{
	alert("Edit")
	document.pal.action="edit";
	document.pal.submit();
}
function delete1()
{
	alert("Delete")
	document.pal.action="delete";
	document.pal.submit();
}
</script>


</head>
<body>
<form name="pal">
<center>
 <table>
<tr><th>Emp Id</th><th>First Name</th><th>Last name</th><th>BirthDate</th><th>BloodGroup</th>
<th>Gender</th><th>MobileNumber</th><th>EmailId</th><th>Languages</th><th>UserName</th><th>Password</th></tr>
	<c:forEach items="${data}" var="d">
			<tr>
				<td><input type="radio" name="empId" value="${d.empId}">${d.empId}</td>
				<td>${d.firstName}</td>
				<td>${d.lastName}</td>
				<td>${d.dob}</td>
				<td>${d.bloodGroup}</td>
				<td>${d.gender}</td>
				<td>${d.mobileNumber}</td>
				<td>${d.emailId}</td>
				<td>${d.knownLanguages}</td>
				<td>${d.userName}</td>
				<td>${d.password}</td>
			</tr>
			</c:forEach>
</table> 

<input type="submit" value ="Add" onclick="add1()">
<input type="submit" value ="Edit" onclick="edit1()">
<input type="submit" value ="Delete" onclick="delete1()">
	</center>	
	</form>		
</body>
</html>