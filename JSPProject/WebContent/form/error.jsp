<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" isErrorPage="true" 
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%-- error ó�� ������ 
isErrorPage="true"�Ӽ��� �پ��ִ� ������������ exception �⺻ ��ü�� ����� �� �ִ�.
--%>
<body>
	<h1>���� �߻�</h1>
	message:
	<%=exception.getMessage()%>
	<br> class:
	<%=exception.getClass().getName()%>
	<br>



</body>
</html>