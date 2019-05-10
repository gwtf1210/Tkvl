<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 화면</title>
</head>
<body>
	<h1>로그인 화면</h1>
	<c:if test="${!empty msg}">
		<h4>${msg}</h4>
	</c:if>
	<form action="login.addr" method="post">
		id:<input type="text" name="id"><br> name:<input
			type="text" name="name"><br> <input type="submit"
			value="로그인"> <input type="reset" value="초기화">
	</form>
	<br>
	<a href="list.addr">초기화면</a>

</body>
</html>