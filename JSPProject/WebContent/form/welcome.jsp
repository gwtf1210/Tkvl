<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="x" class="com.hello.HelloBean" scope="request"></jsp:useBean>

	<h1><%=request.getParameter("id")%>!!!
	</h1>
	<h1><%=request.getParameter("pass")%></h1>
	<br>
	<h1>name: <%=x.getName() %></h1>
	<a href="login.html">back</a>
</body>
</html>