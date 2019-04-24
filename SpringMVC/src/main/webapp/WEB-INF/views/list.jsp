<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Customer Data</h1>

	<table border="1">
		<tr style="font-weight: bold;">
			<td>NUM</td>
			<td>NAME</td>
		</tr>

		<c:forEach var="cus" items="${list}">
			<tr>
				<td>${cus.num}</td>
				<td><a href="detail.mvc?num=${cus.num}">${cus.name}</a></td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<a href="insert.mvc">add new customer</a>
</body>
</html>