<%@page import="bean.userVO"%><%@page import="bean.userDAO"%><%@page import="bean.teacherVO"%><%@page import="bean.teacherDAO"%><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
	String teacherId = (String)session.getAttribute("teacherId");
    teacherDAO teacherDAO = new teacherDAO();
    teacherVO teacherVO = teacherDAO.getTeacherInfo(teacherId);
    
	String userId = (String)session.getAttribute("userId");
    userDAO userDAO = new userDAO();
    userVO userVO = userDAO.getUserInfo(userId);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Better Class</title>
</head>
<body>
메인페이지 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="uOrTLogin.html"><button type="submit">로그인</button></a>
<a href="uOrTJoin.html"><button type="submit">회원가입</button></a>
<a href="userPage.jsp?id=<%=userVO.getuID()%>"><button type="submit" id="user">유저페이지</button></a>
<a href="teacherPage.jsp?id=<%=teacherVO.gettID()%>"><button type="submit" id="teacher">강사페이지</button></a>
</body>
</html>