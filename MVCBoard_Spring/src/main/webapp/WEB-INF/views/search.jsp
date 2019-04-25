<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<body>
	<center>
		<jsp:include page="nav_login.jsp" />
		<h1>JSP 게시판</h1>
		<br>
		<div class="container main-contents">
			<form action="search.bod" method=POST>
				<div
					class="form-group col-sm-3 col-sm-offset-2 col-md-3 col-md-offset-2 col-lg-3 col-lg-offset-2"
					style="display: inline-block;">
					<label for="key">검색 조건</label> <select class="form-control"
						id="key" name="key">
						<option value="TITLE">TITLE</option>
						<option value="NAME">NAME</option>
					</select>
				</div>
				<div class="form-group col-sm-5 col-md-5 col-lg-5">
					<label for="word">검색 단어</label>
					<div id="word">
						<input type="text" class="form-control" name="word"
							style="width: 80%; display: inline-block;"> <input
							type="submit" class="btn btn-dark" value="검색"
							style="display: inline;">
					</div>
				</div>
			</form>
		</div>

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
		<br></br> <a href=index.bod>초기화면</a>
</body>
</html>