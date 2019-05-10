<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
	<c:if test="${empty id}">
		<a href="login.addr">로그인</a>
	</c:if>

	<c:if test="${!empty id}">
		<h3>
			Welcome, ${id} <a href="logout.addr">로그아웃</a>
		</h3>
	</c:if>
</body>
</html>