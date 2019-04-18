<%@ page contentType="text/html;charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<center>
		<h1>JSP 게시판</h1>
		<c:if test="${!empty id }">
		${id}님 로그인 되었습니다. <a href="logout.bod">로그아웃</a>
		</c:if>

		<c:if test="${empty id }">
			<form action="login.bod" method="post">
				ID: <input type="text" name="id" id="id"> PASS: <input
					type="password" name="pass"> <input type="submit"
					value="로그인">
			</form>
		</c:if>
		<br>
		<TABLE BORDER=1 CELLSPACING=1 CELLPADDING=1>
			<TR>
				<th width=100 bgcolor=#113366><font color=#ffffee size=2>번호</th>
				<th width=200 bgcolor=#113366><font color=#ffffee size=2>제목</th>
				<th width=100 bgcolor=#113366><font color=#ffffee size=2>글쓴이</th>
				<th width=150 bgcolor=#113366><font color=#ffffee size=2>날짜</th>
				<th width=100 bgcolor=#113366><font color=#ffffee size=2>조회수</th>

				<c:forEach items="${list}" var="b">
					<tr bgcolor=pink>
						<td align=center bgcolor=pink>&nbsp;<font size=2>${b.num}</td>

						<td align=center bgcolor=pink>&nbsp;<font size=2><a
								href="read.bod?num=${b.num}">${b.title}</a></td>

						<td align=center bgcolor=pink>&nbsp;<font size=2>${b.name}</td>

						<td align=center bgcolor=pink>&nbsp;<font size=2>${b.wdate}</td>

						<td align=center bgcolor=pink>&nbsp;<font size=2>${b.count}</td>
					</tr>
				</c:forEach>
		</table>
		<br></br> <a href=insertForm.bod>새글쓰기</a>
</body>
</html>