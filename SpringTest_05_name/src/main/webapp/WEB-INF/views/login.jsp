<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α��� ȭ��</title>
</head>
<body>
	<h1>�α��� ȭ��</h1>
	<c:if test="${!empty msg}">
		<h4>${msg}</h4>
	</c:if>
	<form action="login.addr" method="post">
		id:<input type="text" name="id"><br> name:<input
			type="text" name="name"><br> <input type="submit"
			value="�α���"> <input type="reset" value="�ʱ�ȭ">
	</form>
	<br>
	<a href="list.addr">�ʱ�ȭ��</a>

</body>
</html>