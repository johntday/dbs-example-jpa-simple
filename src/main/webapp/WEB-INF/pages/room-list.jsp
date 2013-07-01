<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Room List page</title>
</head>
<body>
<h1>Room List page</h1>
<table style="text-align: center;" border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="50px">id</th>
<th width="50px">code</th>
<th width="50px">name</th>
<th width="50px">description</th>
<th width="50px">floor</th>
<th width="50px">numberOfSeats</th>
<th width="50px">action</th>
</tr>
</thead>
<tbody>
<c:forEach var="room" items="${roomList}">
<tr>
<td>${room.id}</td>
<td>${room.code}</td>
<td>${room.name}</td>
<td>${room.description}</td>
<td>${room.floor}</td>
<td>${room.numberOfSeats}</td>
<td>
<a href="${pageContext.request.contextPath}/room/edit/${room.id}.html">Edit</a><br/>
<a href="${pageContext.request.contextPath}/room/delete/${room.id}.html">Delete</a><br/>
</td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="${pageContext.request.contextPath}/">Home page</a>
</body>
</html>