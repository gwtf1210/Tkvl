<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�˻�ȭ��</title>
</head>
<body>
	<h2>�˻�ȭ��</h2>
	<jsp:include page="nav_login.jsp"></jsp:include>
	<br>
	<table border="1">
		<c:forEach items="${list}" var="b">
			<tr>
				<td>${b.id}</td>
				<td><a href="detail.addr?id=${b.id}">${b.name}</a></td>
				<td>${b.phone}</td>
				<td>${b.address}</td>
				<td>${b.company}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<a href="list.addr">�ʱ�ȭ��</a>

</body>
</html>