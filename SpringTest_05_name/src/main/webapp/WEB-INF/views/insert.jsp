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
	<form action="insert.addr" method="post">
	name: <input name="name" type="text"><br>
	address: <input name="address" type="text"><br>
	phone: <input name="phone" type="text"><br>
	company: <input name="company" type="text"><br>
	<input type="submit" value="추가"> 
	</form>
	<br>
	<br>
	<a href="list.addr">초기화면</a>

</body>
</html>