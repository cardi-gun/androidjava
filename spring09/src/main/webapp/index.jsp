<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- taglib를 통해 sql구문 전송 -->
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 검색입니다.</h3>

<a href="one.do?no=2">2번 게시글 검색하기</a>
<a href="one.do?no=3">3번 게시글 검색하기</a>
<a href="one.do?no=4">4번 게시글 검색하기</a>



<form action="review.do">
작성번호<input type="text" name="no"><br>
출력할 제목을 적어주세요<input type="text" name="title"><br>
출력할 내용을 적어주세요<input type="text" name="content"><br>
작성자<input type="text" name="writer"><br>
<button type="submit">출력</button>
</form>
 
 
 <hr color="red">
 <!-- 데이터 소스, DB연결 
 	= 태그 사이에 내용(contents)이 없음, 빈태그 -->
 <sql:setDataSource
 	url="jdbc:mysql://localhost:3366/shop"
 	driver="com.mysql.jdbc.Driver"
 	user="root"
 	password="1234"
 	scope="application"
 	var="db"
 />
 
 <!-- 결과를 가져오는 sql구문 -->
 <sql:query var="list" dataSource="${db}">
 	select * from reply
 </sql:query>
 
 
 
  <!-- 저장만 하는 sql 구문 -->
 <sql:update>
 		insert into reply values (NULL,1,2,1)
 </sql:update>
 
<fmt:formatNumber value="7894561.23"/>
 
 <c:forEach items="${list.rows}" var="vo">
${vo.content}<br>
 </c:forEach>
 
 
</body>
</html>



