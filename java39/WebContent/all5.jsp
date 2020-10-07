<%@page import="java.util.List"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    String title = request.getParameter("title");
    BbsDAO dao = new BbsDAO(); 
    List<BbsVO> list = dao.all(title);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>게시판 전체 글 출력, 전체는 <%= list.size() %>개</h3>
<hr color="red">
<table border="1">
<tr>
<td>글번호</td><td>제목</td><td>내용</td><td>작성자</td>
</tr>
<%for (int i=0; i<list.size();i++){
	BbsVO vo = list.get(i);
	%>
<tr>
   <td><%= vo.getNo() %></td>
   <td><%= vo.getTitle() %></td>
   <td><%= vo.getContent() %></td>
   <td><%= vo.getWriter() %></td>
</tr>
<%} %>
</table>
</form>
</body>
</html>