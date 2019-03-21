<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%-- 선언 : 필드나 메소드 선언시 사용 --%>
	<%!int age = 30;

	public String hello(String name) {
		return "hello, " + name;
	}%>
	<%
		if (age > 20) {
	%>
	<h1>too old...</h1>


	<%
		} else {
	%>
	<h2>too young...</h2>
	<%
		}
	%>

	<hr>
	age :
	<%=age%><br> message :
	<%=hello("jane")%>
	
</body>
</html>