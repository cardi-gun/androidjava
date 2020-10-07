
<%@page import="bean.BbsDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- //1.VO를 만들어서 -->
<jsp:useBean id="vo" class="bean.BbsVO"></jsp:useBean>
<!-- //2.전달되는 값을 받은 다음, VO에 넣어준다 -->
<jsp:setProperty property="*" name="vo"/>
<%

//3.DAO를 이용해서, insert처리함.
BbsDAO dao = new BbsDAO(); 
boolean result = dao.create(vo);
//4.처리결과를 client에게 알려준다.
String check ="게시글 작성 실패!";
if(result){
	check="게시글 작성 성공!";
}
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
	제목 : <%= vo.getTitle()%>	<br> 
	내용 : <%= vo.getContent()%>	<br> 
	작성자 : <%= vo.getWriter()%>	<br> 
	<h3><%=check %></h3>
	<a href="member.html">게시글 화면으로</a>
</body>
</html>