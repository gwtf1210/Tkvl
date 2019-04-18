<%@ page contentType="text/html;charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<center>
		<h1>글 읽기</h1>
		<p>
		<TABLE BORDER=2 CELLSPACING=2 CELLPADDING=2>
			<TR>
				<TH WIDTH=200>NUM</TH>
				<TD width=300 align=center>${b.num}</TD>
				<TH WIDTH=300>NAME</TH>
				<TD width=300 align=center>${b.name}</TD>
			</TR>
			<TR>
				<TH WIDTH=200>DATE</TH>
				<TD width=300 align=center>${b.wdate}</TD>
				<TH WIDTH=300>COUNT</TH>
				<TD width=300 align=center>${b.count}</TD>
			</TR>
			<TR>
				<TH WIDTH=200>TITLE</TH>
				<TD COLSPAN=3>${b.title}</TD>
			</TR>
			<TR>
				<TH WIDTH=200>CONTENT</TH>
				<TD COLSPAN=3><textarea readonly cols=120 rows=20>${b.content}</textarea></TD>
			</TR>
		</TABLE>
		<br> <br> <a href="list.bod">전체화면</a>&nbsp;&nbsp;&nbsp;
	</center>
</body>
</html>
</table>
