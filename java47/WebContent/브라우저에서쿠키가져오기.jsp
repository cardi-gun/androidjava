<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//쿠키는 받아오는게 배열형태
Cookie[] list = request.getCookies();
out.println("쿠키개수: " +list.length+"개<br>");

for(int i =0; i < list.length; i ++){ //int를 1로 올리지 않는다 -> 사람마다 브라우저에 저장되는 순서가 다를수 있기때문에
	if(!list[i].getName().equals("JSESSIONID")){// 이름이 JSESSIONID 과 다른것을 출력한다.
%>
쿠키 이름 : <%= list[i].getName() %>,
쿠키 값 : <%= list[i].getValue() %><br>
<% 
}
}
%>
</body>
</html>