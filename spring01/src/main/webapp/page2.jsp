<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. page1에서 전달된값 받아오기 -->
    <%
    //컨트롤러(controller 역할)
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    %>
    <!-- 2. DB처리 : 특정한 처리에 대한 방법을 정의 하는 클래스(model class) -->
    <!-- DAO : 모델 역할 -->
    <%
    String result = "로그인 실패";
    if(id.equals("root")&& pw.equals("1234")){
    	result = "로그인 성공";
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- 3. 처리결과를 클라이언트에게 알려주기 -->
    <!-- 결과를 알려주는 view역할 -->
로그인결과 : <%= result %>
</body>
</html>