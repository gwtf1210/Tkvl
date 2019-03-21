<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style="background-color: purple;">

	<%
		for (int i = 1; i <= 5; i++) {
	%>
	<span style="color: white"><%=i%>. Hello</span>
	<hr style="border-color: red">

	<%
		}
	%>


</body>
</html>