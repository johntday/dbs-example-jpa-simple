<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<title>Home page</title>
	    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/styles.css" type="text/css"/>
	</head>
	<body>
		<h1>Home page</h1>
		
		<div class="messages">
		    <c:if test="${message != null}">
		        <div class="messageblock"><c:out value="${message}"/></div>
		    </c:if>
		    <c:if test="${errorMessage != null}">
		        <div class="errorblock"><c:out value="${errorMessage}"/></div>
		    </c:if>
		</div>
		
		<h3>Room</h3>
		<ul>
			<li><a href="${pageContext.request.contextPath}/room/create">Create</a></li>
			<li><a href="${pageContext.request.contextPath}/room/list">View all</a></li>
		</ul>
				
		<hr/>
		<img  src="${pageContext.request.contextPath}/static/img/erd.png" alt="Database diagram for MySQL" title="Database diagram for MySQL" /><br/>
		<a href="${pageContext.request.contextPath}/static/img/erd-detail.png" title="Database diagram for MySQL">Detailed Diagram for MySQL</a>
	</body>
</html>