<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>정보를 삭제하는 페이지 입니다.</h3>
<!-- webapp아래로 자동으로 페이지를 넘기는 방법 , 서버가 브라우저에게 명령-->
<%-- <%response.sendRedirect("index.jsp"); %> --%>

<!-- views아래로 자동으로 페이지를 넘기는 방법 , 서버가 본인이 출력-->
<jsp:forward page="home.jsp"></jsp:forward>

<a href="index">첫 페이지로</a>
</body>
</html>