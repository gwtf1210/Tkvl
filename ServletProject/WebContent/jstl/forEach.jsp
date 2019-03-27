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
	<c:forEach begin="1" end="5" step="1" var="i">
	${i }.hello, jstl<hr>
	</c:forEach>

	<br>
	<table border=1>
		<c:forEach var='i' begin='1' end='9'>
			<tr>
				<c:forEach var='j' begin='2' end='9'>
					<td>${j}* ${i} = ${i*j }</td>
				</c:forEach>
			</tr>


		</c:forEach>
	</table>

</body>
</html>