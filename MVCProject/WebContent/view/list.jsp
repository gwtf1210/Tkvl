<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Data</h1>
	<form action="search.mvc" method="post">
	검색:
	<select name="condition">
		<option value="name">NAME</option>
		<option value="address">ADDRESS</option>
		<option value="tel">TEL</option>
	</select>
	<input type="text" name="word">
	<input type="submit" value="검색">
	</form>
	
	
	<table border="1">
		<c:forEach items="${list}" var="m">
			<tr>
				<td>${m.id}</td>
				<td><a href="read.mvc?id=${m.id}">${m.name}</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="insertForm.mvc">회원추가</a>
</body>
</html>