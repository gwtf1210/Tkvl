<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- html���� ���� �޾ƿͼ� ȭ�鿡 ��� --%>
	<h1>login ���</h1>
	<%
		// �ѱ� ó��
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String temp = request.getParameter("code");
		int code = Integer.parseInt(temp);
	%>
	welcome,
	<%=id%>!!!
	<br> password is....
	<%=pass%><br>
	<br> code is....
	<%=code%><br>
	<a href="login.html"></a>


</body>
</html>