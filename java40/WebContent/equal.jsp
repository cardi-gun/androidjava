<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- %@ 이 파일에 대한 정보 -->
<!--  
실행순서
1. 클라이언트가 입력해서 제출한 데이터를 받아온다.
2. DB연동해서 처리해서 결과를 받아와야 한다.
3. 받아온 결과에 따라서 화면을 결과(html)를 만들어서 출력한다.(클라이언트쪽에)
-->

<!-- jsp페이지에 자바코드 들어가는 부분 -->
<%	
	String userId = request.getParameter("id");
	MemberDAO dao = new MemberDAO();
	int result = dao.read(userId);
	String check = "가입가능한 아이디 입니다.";
	if(result == 1){
		check = "이미 아이디가 있습니다.";
	}
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>입력하신 아이디는 <%= check %></h3>
	
	<hr color="red">
	<a href="js07.html">로그인 페이지로</a>

</body>
</html>