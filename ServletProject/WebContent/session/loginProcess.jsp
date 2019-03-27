<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- id, pass 값 받아와서 session에 저장후 main화면으로 넘어감 --%>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	session.setAttribute("id",id);
	session.setAttribute("pass",pass);
%>

</body>
</html>