<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>값 집어 넣기</h3>
<sql:setDataSource

driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://megacardi.co7psbdzuvzm.us-east-2.rds.amazonaws.com:3306/mega"
user="root"
password="mega709-="
scope="application" var="db"
/>

<sql:update dataSource="${db}">
   insert into member values('park', 'park', 'park', 'park')

</sql:update>
</body>
</html>