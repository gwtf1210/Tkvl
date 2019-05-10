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
	<h1>Add Customer Data</h1>
	<form action="insert.mvc" method="post">
		num:<input type="text" name="num"><br>
		name:<input type="text" name="name"><br>
		address:<input type="text" name="address"><br>
		<input type="submit" value="add customer">
	</form>

	<br>
	<a href="list.mvc">초기 화면</a>
</body>
</html>