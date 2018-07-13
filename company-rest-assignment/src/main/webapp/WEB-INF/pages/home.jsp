<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Registered Employee and Management</title>
	</head>
	<body>
	<div align="center">

		<h1>Registered Employee List</h1>		
		<table border="1">
			<th>Name</th>
			<th>Contact Email</th>
			<th>Address</th>
			<th>Contact No</th>
			<th>Edit/Delete</th>
			
			<c:forEach var="employee" items="${listEmployee}">
				<tr>
					<td>${employee.name}</td>
					<td>${employee.email}</td>
					<td>${employee.address}</td>
					<td>${employee.telephone}</td>
					<td>
						<a href="editEmployee?id=${employee.id}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="deleteEmployee?id=${employee.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
			
		</table>
		<h4>
			New Employee? Register <a href="newEmployee">here</a>
		</h4>
	</div>
	</body>
</html>