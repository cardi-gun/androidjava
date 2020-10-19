<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String id = request.getParameter("id");
    MemberDAO dao = new MemberDAO();
    int result = dao.read(id);
    String textresult = "<font color=green>사용가능한 아이디입니다.</font>";
    if(result == 1){
    	textresult = "<font color=red>사용불가능한 아이디입니다.</font>";
    }
    %><%= textresult %>