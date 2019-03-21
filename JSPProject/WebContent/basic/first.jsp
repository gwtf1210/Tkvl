<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page info="첫번째 jsp 파일" import="java.io.InputStream"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>hello jsp</h1>
	<%
		String name = "tommy";
	%>
	name:<%=name%>
	<hr>
	<%@ include file="insertform.html"%>

</body>
</html>