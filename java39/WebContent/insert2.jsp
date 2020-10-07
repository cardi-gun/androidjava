<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	//1.VO를 만들어서
MemberVO vo = new MemberVO();
//2.전달되는 값을 받은 다음, VO에 넣어준다
String uID = request.getParameter("uID");
String uPW = request.getParameter("uPW");
String uName = request.getParameter("uName");
String uTel = request.getParameter("uTel");
vo.setId(uID);
vo.setPw(uPW);
vo.setName(uName);
vo.setTel(uTel);
//3.DAO를 이용해서, insert처리함.
MemberDAO dao = new MemberDAO();
boolean result = dao.create(vo);
//4.처리결과를 client에게 알려준다.
String check ="회원가입실패!";
if(result){
	check="회원가입성공!";
}
String uBrith = request.getParameter("uBrith");
String uGender = request.getParameter("uGender");
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
	아이디 : <%=uID%>	<br> 
	비밀번호 :<%=uPW%><br> 
	이름 :<%=uName%><br> 
	생년월일 :<%=uBrith%><br> 
	성별 :<%=uGender%><br> 
	전화번호 :<%=uTel%><br>
	
	<h3><%=check %></h3>
	<a href="member.html">가입화면으로</a>
</body>
</html>