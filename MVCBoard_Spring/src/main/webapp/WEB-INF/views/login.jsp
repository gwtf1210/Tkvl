<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>login</h1>
	<form action="loginProcess.bod" method="post">
		id:<input type="text" name="id"><br>
		pass : <input type="password" name="pass"><br>
		<input type="submit" value="login">
	</form>

	<br>
	<a href="index.bod">초기화면</a>
</body>
</html>