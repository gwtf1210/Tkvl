<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<%
		//post인 경우 ok, get인 경우 계속 깨짐
		request.setCharacterEncoding("utf-8");

		//client(html)로부터 오는 데이터 받기
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
	%>hello,,,<%=id%>...
	<br>password is...<%=pass%>
</body>
</html>