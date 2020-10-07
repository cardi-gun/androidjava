
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

    <!--  1. 넘어오는 4개의 값 받아서 vo에 넣기  액션테그 사용  -->
    <jsp:useBean id="vo" class="bean.MemberVO"></jsp:useBean>
    <!-- useBean액션태그: new를 가지고 객체생성, import역할-->
    <jsp:setProperty property="*" name="vo"/>
    <!-- setProperty액션태그: 클라이언트가 입력한 파라메터를 받아오고, vo의 set()메서드를 호출해준다. -->
    
    <!--  2. DAO를 이용해서 DB 연동하여 결과 받아와야함.  -->
    <!--  3. 결과를 html로 만들어서 전송해야함.  -->
    

<%
MemberDAO dao = new MemberDAO();
boolean result = dao.update(vo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>업데이트 결과는 <%= result %>입니다.
	</h3>
	<hr color="red">

	
	[
	<a href="index.html"> 처음페이지 </a>|
	<a href="one.jsp?id=<%=vo.getId()%>"> 검색 </a>|
	<!-- 바로 삭제 할수 있도록 변경 -->
	<a href="delete.jsp?id=<%=vo.getId()%>"> 삭제 </a>]


</body>
</html>