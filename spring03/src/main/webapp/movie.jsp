<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
</head>
<body>
	<script type="text/javascript">
		$(function() {
			//alert("환영합니다.")

			$('#b1').click(function() {
				replyValue = $("#reply").val();
				$.ajax({
					url : "reply.do",
					data : {
						reply : replyValue
					},
					success : function(result) {
						$('#d1').append(result)
					}
				})
			})

			$('#b2').click(function() {
				idValue = $('#id').val();
				$.ajax({
					url : "sign.do",
					data : {
						id : idValue
					},
					success : function(result) {
						$('#d2').append(result)
					}
				})
			})

		})
	</script>

	<form action="movie.do">
		영화제목 : <input type="text" name="title"><br> 
		영화관람료 : <input type="text" name="price"><br>
		<button type="submit">영화예매하기</button>
	</form>

	<hr color="red">
	댓글 :
	<input type="text" id="reply">
	<button id="b1">댓글 달기</button>
	<hr color="red">
	<div id="d1"></div>

	<hr color="red">
	아이디체크 :
	<input type="text" id="id">
	<br>
	<button id="b2">아이디중복확인</button>
	<hr color="red">
	<div id="d2"></div>

</body>
</html>