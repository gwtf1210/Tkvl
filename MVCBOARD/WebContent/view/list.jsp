<%@ page contentType="text/html;charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<center>
		<h1>JSP �Խ���</h1>
		<c:if test="${!empty id }">
		${id}�� �α��� �Ǿ����ϴ�. <a href="logout.bod">�α׾ƿ�</a>
		</c:if>

		<c:if test="${empty id }">
			<form action="login.bod" method="post">
				ID: <input type="text" name="id" id="id"> PASS: <input
					type="password" name="pass"> <input type="submit"
					value="�α���">
			</form>
		</c:if>
		<br>
		<TABLE BORDER=1 CELLSPACING=1 CELLPADDING=1>
			<TR>
				<th width=100 bgcolor=#113366><font color=#ffffee size=2>��ȣ</th>
				<th width=200 bgcolor=#113366><font color=#ffffee size=2>����</th>
				<th width=100 bgcolor=#113366><font color=#ffffee size=2>�۾���</th>
				<th width=150 bgcolor=#113366><font color=#ffffee size=2>��¥</th>
				<th width=100 bgcolor=#113366><font color=#ffffee size=2>��ȸ��</th>

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
		<br></br> <a href=insertForm.bod>���۾���</a>
</body>
</html>