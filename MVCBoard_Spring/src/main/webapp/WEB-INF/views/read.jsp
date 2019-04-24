<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<body>
	<center>
		<h1>글 읽기</h1>
		<p>
		<TABLE BORDER=2 CELLSPACING=2 CELLPADDING=2>
			<TR>
				<TH WIDTH=200>NUM</TH>
				<TD width=300 align=center>${bod.num}</TD>
				<TH WIDTH=300>NAME</TH>
				<TD width=300 align=center>${bod.name}</TD>
			</TR>
			<TR>
				<TH WIDTH=200>DATE</TH>
				<TD width=300 align=center>${bod.wdate}</TD>
				<TH WIDTH=300>COUNT</TH>
				<TD width=300 align=center>${bod.count}</TD>
			</TR>
			<TR>
				<TH WIDTH=200>TITLE</TH>
				<TD COLSPAN=3>${bod.title}</TD>
			</TR>
			<TR>
				<TH WIDTH=200>CONTENT</TH>
				<TD COLSPAN=3><textarea readonly cols=120 rows=20>${bod.content}</textarea></TD>
			</TR>
		</TABLE>
		<br> <br> <a href="delete.bod?num=${bod.num}">삭제하기</a>&nbsp;&nbsp;&nbsp;
		<br> <a href="index.bod">초기화면</a>&nbsp;&nbsp;&nbsp;
	</center>
</body>
</html>
</table>
