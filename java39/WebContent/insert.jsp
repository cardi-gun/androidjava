<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
 String uID = request.getParameter("uID");
 String uPW = request.getParameter("uPW");
 String uName = request.getParameter("uName");
 String uBrith = request.getParameter("uBrith");
 String uGender = request.getParameter("uGender");
 String uTel = request.getParameter("uTel");
 
 MemberDAO dao = new MemberDAO();
 dao.create(uID, uPW, uName, uTel);
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>입력한정보</h3>
	<hr color="red">
	아이디 : <%= uID %> <br>
	비밀번호 : <%= uPW %> <br>
	이름 : <%= uName %> <br>
	생년월일 : <%= uBrith %> <br>
	성별 : <%= uGender %> <br>
	전화번호 : <%= uTel %> <br>
	<h3>회원가입 완료!</h3>
	<a href="member.html">가입화면으로</a>
</body>
</html>