<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<jsp:useBean id="hello" class="com.hello.HelloBean" scope="page" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	name:<%=hello.getName()%>
	<hr>
	<%
		hello.setName("kim");
	%>
	name:<%=hello.getName()%>
	<a href="hellobean2.jsp">hellobean2</a>

</body>
</html>
