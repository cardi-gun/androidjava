<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script type="text/javascript">

$(function() {
    $('#reply').click(function() {
       contenValue = $('#content').val()
       $.ajax({
          url: "create.do",
          data: {
             content: contenValue,
             original: '${one.no}',//one.get~~
             writer: '${id}'//세션 아이디
          },
          success: function(result) {
             $('#table2').append(result);
          	 location.reload();
          }
       })//ajax
    })//click
 })//function


</script>

</head>
<body>
	<h3>게시물 하나 검색 화면 입니다.</h3>
	<hr>
	<table align="center">
		<tr>
			<td style="color: blue; width: 150px; background: yellow;">게시물번호</td>
			<td style="color: blue; width: 250px; background: pink;">${one.no}</td>
		</tr>
		<tr>
			<td style="color: blue; width: 150px; background: yellow;">게시물제목</td>
			<td style="color: blue; width: 250px; background: pink;">${one.title}</td>
		</tr>
		<tr>
			<td style="color: blue; width: 150px; background: yellow;">게시물내용</td>
			<td style="color: blue; width: 250px; background: pink;">${one.content}</td>
		</tr>
		<tr>
			<td style="color: blue; width: 150px; background: yellow;">게시물작성사</td>
			<td style="color: blue; width: 250px; background: pink;">${one.writer}</td>
		</tr>
	</table>





	<hr>
	댓글:<input id="content"><button id ="reply">reply</button>
	<div style="text-align: center;">dddd</div> <!-- 외래키 original연결한것 data  -->
	<div id="d2" style="width: 350px; height: 30px;">
		<%-- ${status.index + 1} : 순번 찍기 --%>
		<%-- ${total - status.index} : 역순 찍기 total은 계산해서 model에서 넘기는 것이다.--%>
		<table align="center" width=350 id="table2">
			<!-- varStatus="status" 인덱스를 갖겠다는 뜻이다. -->
			<c:forEach items="${list}" var="vo" varStatus="status">
				<tr style="background: lime">
              	<%-- <td style="width: 50px;">${vo.no}</td> --%>
                <%-- <td style="width: 50px;">${status.index+1}</td> --%>
				<td style="width: 50px;">${status.index+1}</td>
                <td style="width: 300px;">${vo.content}</td>
                <td style="width: 100px;">${vo.writer}</td>
                <td style="width: 100px;">
						<!--  one.do?no=1  --> <a
						href="delete3.do?no=${vo.no}&original=${vo.original}">
							<button style="background: yellow;">삭제</button>
					</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>