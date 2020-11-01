<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 받아오는 값이 파라메타 이기 때문에 param.color로 받아온다. -->
<%--  <%if(param.color != null){ %> 
<%} %> --%>
${param.color}색 자동차
<img alt="" src="resources/img/car.jpg" width="600px" height="400px">
<a href="car2.do?color=black">다른 차량 보기</a>
</body>
</html>