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
	<form action="insert.addr" method="post">
	name: <input name="name" type="text"><br>
	address: <input name="address" type="text"><br>
	phone: <input name="phone" type="text"><br>
	company: <input name="company" type="text"><br>
	<input type="submit" value="�߰�"> 
	</form>
	<br>
	<br>
	<a href="list.addr">�ʱ�ȭ��</a>

</body>
</html>