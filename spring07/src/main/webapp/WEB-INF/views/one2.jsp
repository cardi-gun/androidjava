<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
회원 id = ${vo.id}<br>
회원 pw = ${vo.pw}<br>
회원 name = ${vo.name}<br>
회원 tel = ${vo.tel}<br>
</body>
</html>