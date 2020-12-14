<%@page import="java.sql.DriverManager"%>
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
Class.forName("com.mysql.jdbc.Driver");
%>
 드라이버 연결 성공!<br>
 <% 
 	String url = "jdbc:mysql://megacardi.co7psbdzuvzm.us-east-2.rds.amazonaws.com:3306/mega";
 	String user = "root";
 	String password = "mega709-=";
 	
 	DriverManager.getConnection(url, user, password);
 %>
 aws - rds 연결 성공
</body>
</html>