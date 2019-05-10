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
	<h1>Customer Inserted</h1>
	<h2>추가된 고객 정보는 다음과 같습니다.</h2>
	<table border="1">
		<tr style="font-weight: bold;">
			<td>NUM</td>
			<td>NAME</td>
			<td>ADDRESS</td>
		</tr>

		<tr>
			<td>${cus.num}</td>
			<td>${cus.name}</td>
			<td>${cus.address}</td>
		</tr>
	</table>
	<br>
	<a href="list.mvc">초기화면</a>
</body>
</html>