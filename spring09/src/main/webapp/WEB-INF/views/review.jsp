<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시물 등록정보 입니다.</h3>
<hr>
게시물 no : ${bbsVO.no} <br>
게시물 title : ${bbsVO.title} <br>
게시물 content : ${bbsVO.content} <br>
게시물 writer : ${bbsVO.writer} <br>

<a href="index.jsp">첫 페이지로</a>
<!-- 갱신, 삭제때는 DB에 확인을 하고 와야하기 때문에 바로 view에서 view로 가지 못하고 -->
<!-- 컨트롤러를 통해 이동해야 한다. -->
<a href="update.do">수정 페이지로</a>


</body>
</html>