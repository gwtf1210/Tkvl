<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��ȭ��</title>
</head>
<body>
	<h2>��ȭ��</h2>
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
	<a href="delete.addr?id=${book.id}">����</a>
	<br>
	<a href="list.addr">�ʱ�ȭ��</a>

</body>
</html>