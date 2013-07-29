<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<title>New Room page</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/styles.css" type="text/css"/>
	</head>
	<body>
		<h1>New Room page</h1>
		<form:form method="POST" commandName="room" action="${pageContext.request.contextPath}/room/create">
			<fieldset>
				<legend>Room</legend>
				<table>
					<tbody>
						<tr>
							<td>code *</td>
							<td><form:input path="code" /></td>
							<td><form:errors path="code" cssStyle="color: red;" /></td>
						</tr>
						<tr>
							<td>name *</td>
							<td><form:input path="name" /></td>
							<td><form:errors path="name" cssStyle="color: red;" /></td>
						</tr>
						<tr>
							<td>description *</td>
							<td><form:input path="description" /></td>
							<td><form:errors path="description" cssStyle="color: red;" /></td>
						</tr>
						<tr>
							<td>floor *</td>
							<td><form:input path="floor" /></td>
							<td><form:errors path="floor" cssStyle="color: red;" /></td>
						</tr>
						<tr>
							<td>numberOfSeats *</td>
							<td><form:input path="numberOfSeats" /></td>
							<td><form:errors path="numberOfSeats" cssStyle="color: red;" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="Create" /></td>
							<td></td>
							<td></td>
						</tr>
					</tbody>
				</table>
			</fieldset>
		</form:form>
		
		<a href="${pageContext.request.contextPath}/">Home page</a>
	</body>
</html>