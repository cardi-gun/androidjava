<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>정보를 갱신하는 페이지 입니다.</h3>
검색결과는 : ${bbsVO2}<br>
<hr>
게시물 no : ${bbsVO2.no} <br>
게시물 title : ${bbsVO2.title} <br>
게시물 content : ${bbsVO2.content} <br>
게시물 writer : ${bbsVO2.writer} <br>
<a href="index.jsp">첫 페이지로</a>
<a href="delete.do">삭제 페이지로</a>
</body>
</html>