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
	<c:set var="id" value="${param.id }" />
	<c:set var="pass" value="${param.pass }" />
	<c:if test="${!empty id and !empty pass }">
		<c:if test="${id == 'tom' and pass =='123' }">
    
        welcome, ${id }!!!
    
        </c:if>
		<c:if test="${id != 'tom' or pass !='123' }">
			<c:redirect url="login.html" />
		</c:if>
	</c:if>

	<c:if test="${empty id or empty pass }">
		id, pass를 입력해주세요.
	</c:if>

	<a href="login.html">back</a>

</body>
</html>
