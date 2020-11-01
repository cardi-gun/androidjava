<%@page import="bean.BasketVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="../Java Resources/src/bean/BasketVO"></jsp:useBean>
<%
   String product = request.getParameter("product"); // product 데이터 가져오기
   String price = request.getParameter("price");
   
   BasketVO vo = new BasketVO(); //리스트에 담을 vo 생성
   vo.setProduct(product);
   vo.setPrice(price);
   
   Arraylist<BasketVO> list = null;
   
   if(product != null){//product 데이터가 null이 아니면
      if (session.getAttribute("basket") != null) {
          //null이 아니라는 의미는 이미 장바구니가 만들어져있다는 얘기
    	  list = (ArrayList<BasketVO>)session.getAttribute("basket");
          list.add(vo);
       } else {
          //null이라는 의미는 장바구니 목록이 안만들어져있다는 얘기
          list = new ArrayList<BasketVO>();
          list.add(vo);
       }
      session.setAttribute("basket", list);//value가 list이고 basket이라는 name의 세션을 생성한다. 
   }else{ //null이면 

   }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   if(vo == null){
%>
      <h3>장바구니가 비어있음.</h3>
   <%
   }else{
   %>
   <h3>장바구니의 개수<%=  %>개 들어있음.</h3>
   <h3>장바구니 목록</h3>
   <hr color="blue">
   <%
      for(String s:){
   %>
      <%= s %><br>
   <%      
      }
   }
   %>
   <hr color="green">
   <a href="null.jsp">장바구니 비우기</a>
</body>
</html>