<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>회원등록</h1>
	<form action="insertProcess.mvc" method="post">
		ID:<input type="text" name="id"><br>
		NAME:<input type="text" name="name"><br>
		ADDRESS:<input type="text" name="address"><br>
		TEL:<input type="text" name="tel"><br>
		<input type="submit" value="회원등록"><br>
	</form>
</body>
</html>