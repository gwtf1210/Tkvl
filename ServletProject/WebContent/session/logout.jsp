<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- session안에 저장되어 있던 값 삭제 --%>

<%
	session.setAttribute("id",null);
	session.setAttribute("pass",null);
	response.sendRedirect("main.jsp");
%>

</body>
</html>