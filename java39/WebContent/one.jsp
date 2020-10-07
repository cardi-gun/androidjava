<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    1. id값 받아오기
    2. DAO와 연동하여 결과 받아와야함.
    3. html로 만들어서 전송해야함.
    -->

<%
	String id = request.getParameter("id");
MemberDAO dao = new MemberDAO();
MemberVO vo = dao.one(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=vo.getId()%>회원정보 검색 내용입니다.
	</h3>
	<hr color="red">
	<table>
		<tr align="center">
			<td width="100" bgcolor="pink">아이디</td>
			<td width="200" bgcolor="yellow"><%=vo.getId()%></td>
		</tr>
		<tr align="center">
			<td width="100" bgcolor="pink">패스워드</td>
			<td width="200" bgcolor="yellow"><%=vo.getPw()%></td>
		</tr>
		<tr align="center">
			<td width="100" bgcolor="pink">이름</td>
			<td width="200" bgcolor="yellow"><%=vo.getName()%></td>
		</tr>
		<tr align="center">
			<td width="100" bgcolor="pink">전화번호</td>
			<td width="200" bgcolor="yellow"><%=vo.getTel()%></td>
		</tr>
	</table>

	<hr color="green">
	[
	<a href="index.html"> 처음페이지 </a>|
	<a href="update.jsp?id=<%=vo.getId()%>"> 수정 </a>|
	<!-- 바로 삭제 할수 있도록 변경 -->
	<a href="delete.jsp?id=<%=vo.getId()%>"> 삭제 </a>]


</body>
</html>