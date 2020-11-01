<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    session.removeAttribute("basket");
    %>
<!-- 페이지를 바로 넘기고싶을때  -->
<jsp:forward page="add.jsp"></jsp:forward>