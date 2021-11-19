<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
    <h1 align="center">Employee List</h1>
<br/>
<table border="1" cellpadding="10">
<tr>
<th>Id</th><th>Name</th><th>Salary</th>
</tr>
<c:forEach var="employee" items="${employees}">
<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
<td>${employee.salary}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
<%-- 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
     --%>