<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- id, pass �� �޾ƿͼ� session�� ������ mainȭ������ �Ѿ --%>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	session.setAttribute("id",id);
	session.setAttribute("pass",pass);
%>

</body>
</html>