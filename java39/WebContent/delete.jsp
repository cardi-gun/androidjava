<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String id = request.getParameter("id");

MemberDAO dao = new MemberDAO();
boolean result = dao.delete(id);
String check = "탈퇴처리 안됨";
if (result){
	check = "탈퇴처리 완료!";
}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>탈퇴결과</h3>
<hr color="red">
<span style="color:red" >
<%=check %>
</span>
</body>
</html>