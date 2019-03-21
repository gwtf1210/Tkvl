<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" isErrorPage="true" 
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%-- error 처리 페이지 
isErrorPage="true"속성이 붙어있는 페이지에서만 exception 기본 객체를 사용할 수 있다.
--%>
<body>
	<h1>예외 발생</h1>
	message:
	<%=exception.getMessage()%>
	<br> class:
	<%=exception.getClass().getName()%>
	<br>



</body>
</html>