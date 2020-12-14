<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>

<script type="text/javascript">
<!-- mvc2를 이용해 list를 받아오는 방식 -->
$(function() {
	$('#b1').click(function() {
		novalue = $("#t1").val();
		console.log(novalue)
		$.ajax({
			url : "json3.do",
			data:{
				No : novalue
			},
			dataType : "json",
			success : function(result){
				console.log(result)
				no = result.no
				title = result.title
				content = result.content
				writer = result.writer
				$('#d1').append(no+" , "+title+" , "
						+content+" , "+writer+"<br>") 
			}
		})
	})
})
</script>

<title>Insert title here</title>
</head>
<body>
<h3>JSON으로 값 받아오기</h3>
<hr>
검색번호 <input type="text" id="t1">
<button id="b1">검색</button>
<div id="d1"></div>
</body>
</html>