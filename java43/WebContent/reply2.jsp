<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    //파라메터값 받아주고
    String reply =  request.getParameter("reply");
    //replyDAO로 댓글을 저장처리
    //성공하면 저장된 데이터를 전송
    String result = "-"+ reply + "<img src='img/car.png' width=100 height=100><br>";
    %><%= result %>
