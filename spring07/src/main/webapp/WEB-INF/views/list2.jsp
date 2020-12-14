<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 테그 라이브러리 생성, prefix(접두사)="고정이름" uri="주소형 아이디" -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원검색정보입니다</h3>
<hr color="red">
<!-- 검색에서 받아온 값이 model 안에 vo로 저장되어있기 때문에 vo.id 형식으로 출력한다. -->
<!-- list.size()만큼 반복 출력 -->

<!-- 네임스페이스를 주고 코어(자바)를 사용한다. -->
<!-- 모델에 담긴 list사이즈 만큼 vo를 꺼낸다. begin(시작위치 지정)/end(끝 위치 지정)-->
<c:forEach var="vo" items="${list}">
회원 id = ${vo.id}<br>
회원 pw = ${vo.pw}<br>
회원 name = ${vo.name}<br>
회원 tel = ${vo.tel}<br>
<hr>
</c:forEach>
</body>
</html>