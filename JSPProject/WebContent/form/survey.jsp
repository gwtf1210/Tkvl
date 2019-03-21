<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- html에서 값을 받아와서 화면에 출력 --%>
	<h1>설문 결과</h1>
	<%
		// 한글 처리
		request.setCharacterEncoding("euc-kr");
		String dept = request.getParameter("employee");
		String employee = request.getParameter("employee");
		String comment = request.getParameter("comment");
		String ide = request.getParameter("ide");
	%>
	
	<h1>dept is...<%=dept%>!!!</h1>
	<h1>employee is....	<%=employee%></h1>
	<h1>comment is... <%=comment%></h1>
	<h1>ide is ... <%=ide%></h1>
	<a href="JdcSurvey.html"></a>


</body>
</html>