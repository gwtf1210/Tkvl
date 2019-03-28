<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Insert Success</h1>
	<h3>등록된 회원 정보는 다음과 같습니다.</h3>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>${m.id}</td>
		</tr>
		<tr>
			<td>NAME</td>
			<td>${m.name}</td>
		</tr>
		<tr>
			<td>ADDRESS</td>
			<td>${m.address}</td>
		</tr>
		<tr>
			<td>TEL</td>
			<td>${m.tel}</td>
		</tr>
	</table>
	<br>
	<a href="insertForm.mvc">add more</a>
	<a href="list.mvc">back</a>
</body>
</html>