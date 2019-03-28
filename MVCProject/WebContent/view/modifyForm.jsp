<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>회원수정</h1>
	<form action="modifyProcess.mvc" method="post">
		ID:<input type="text" readonly="readonly" name="id" value="${m.id}"><br>
		NAME:<input type="text" name="name" value="${m.name}"><br>
		ADDRESS:<input type="text" name="address" value="${m.address}"><br>
		TEL:<input type="text" name="tel" value="${m.tel}"><br>
		<input type="submit" value="수정"><br>
	</form>
</body>
</html>