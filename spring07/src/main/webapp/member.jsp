<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 회원가입 시작합니다.</h3>
<hr color="red">
<form action="create2.do">
회원 아이디 : <input type="text" name="id"><br>
회원 비밀번호 : <input type="text" name="pw"><br>
회원 이름 : <input type="text" name="name"><br>
회원 번호 : <input type="text" name="tel"><br>
<button type="submit">가입하기</button>
<hr color="red">

<h3> 회원삭제 시작합니다.</h3>
<hr color="blue">
</form>
<form action="delete2.do">
회원 아이디 : <input type="text" name="id"><br>
<button type="submit">삭제하기</button>
</form>
<hr color="blue">

<h3> 회원정보 갱신 시작합니다.</h3>
<hr color="green">
<form action="update2.do">
회원 아이디 : <input type="text" name="id"><br>
회원 번호 : <input type="text" name="tel"><br>
<button type="submit">업데이트 하기</button>
</form>
<hr color="green">

<h3> 회원정보 검색 시작합니다.</h3>
<hr color="pink">
<form action="one2.do">
회원 아이디 : <input type="text" name="id"><br>
<button type="submit">회원 검색 하기</button>
</form>
<hr color="pink">

<h3> 전체정보 검색 시작합니다.</h3>
<hr color="yellow">
<a href="list2.do">전체 검색하기</a>
<hr color="yellow">
</body>
</html>