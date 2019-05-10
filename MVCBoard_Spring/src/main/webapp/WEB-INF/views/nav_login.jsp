<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<img alt="image" src="resources/img/f1.jpg">
	<c:if test="${empty id}">
		<a href="login.bod">로그인</a>
	</c:if>
	<c:if test="${!empty id}">
		<h1>
			Welcome, ${id} <a href="logoutProcess.bod">로그아웃</a>
		</h1>
	</c:if>
</body>
</html>