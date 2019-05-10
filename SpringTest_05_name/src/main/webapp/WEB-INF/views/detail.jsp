<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>상세화면</title>
</head>
<body>
	<h2>상세화면</h2>
	<jsp:include page="nav_login.jsp"></jsp:include>
	<br>
	<table border="1">
		<tr>
			<td>${book.id}</td>
			<td>${book.name}</td>
			<td>${book.address}</td>
			<td>${book.phone}</td>
			<td>${book.company}</td>
		</tr>
	</table>
	<br>
	<br>
	<a href="delete.addr?id=${book.id}">삭제</a>
	<br>
	<a href="list.addr">초기화면</a>

</body>
</html>