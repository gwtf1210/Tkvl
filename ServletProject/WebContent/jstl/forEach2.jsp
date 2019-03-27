<%@page import="java.util.ArrayList"%>
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

	<%
		ArrayList<String> movie = new ArrayList<>();
		movie.add("super man");
		movie.add("ant man");
		movie.add("bat man");
		movie.add("spider man");
		movie.add("flash man");

		request.setAttribute("movie", movie);
	%>

	<c:forEach items="${movie }" var="m">
		<h2>${m}</h2>
	</c:forEach>

</body>
</html>