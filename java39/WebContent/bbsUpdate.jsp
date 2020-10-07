<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
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
	int id = Integer.parseInt(request.getParameter("id"));
BbsDAO dao = new BbsDAO();
BbsVO vo = dao.one(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=vo.getNo()%>번 글 수정페이지 입니다.
	</h3>
	<hr color="red">
	<form action="bbsUpdate2.jsp">
	<table>
		<tr align="center">
			<td width="100" bgcolor="pink">글번호</td>
			<td width="200" bgcolor="yellow"><%=vo.getNo()%>
			<input type="hidden" name="no" value="<%=vo.getNo()%>"></td>
		</tr>
		<tr align="center">
			<td width="100" bgcolor="pink">글 제목</td>
			<td width="200" bgcolor="yellow">
			<input type="text" name="title" value="<%=vo.getTitle()%>"></td>
		</tr>
		<tr align="center">
			<td width="100" bgcolor="pink">내용</td>
			<td width="200" bgcolor="yellow">
			<input type="text" name="content" value="<%=vo.getContent()%>"></td>
		</tr>
		<tr align="center">
			<td width="100" bgcolor="pink">작성자</td>
			<td width="200" bgcolor="yellow">
			<input type="text" name="writer" value="<%=vo.getWriter()%>"></td>
		</tr>
		<tr align="center">
		<td colspan="2">
		<button type="submit">수정처리요청</button>
		</td>
		</tr>
	</table>
</form>
	<hr color="green">
	[
	<a href="index.html"> 처음페이지 </a>|
	<a href="one.jsp?id=<%=vo.getNo()%>"> 검색 </a>|
	<!-- 바로 삭제 할수 있도록 변경 -->
	<a href="bbsDelete.jsp?id=<%=vo.getNo()%>"> 삭제 </a>]


</body>
</html>