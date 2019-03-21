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

	<%
	x.setName("anne");
    request.setCharacterEncoding("euc-kr");

    String id = request.getParameter("id");
    String pass = request.getParameter("pass");
	
    if(id.equals("tom")&&pass.equals("1234")){
    	%><jsp:forward page="welcome.jsp">
		<jsp:param value="<%=id%>" name="id"/>
		<jsp:param value="red" name="color"/>
	</jsp:forward>
	<%
    } else {
    	%><jsp:forward page="login.html" />
	<%
    }
%>

</body>
</html>