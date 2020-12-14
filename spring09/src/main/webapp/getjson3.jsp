<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>


<script type="text/javascript">
<!-- mvc2를 이용해 vo 1개를 받아오는 방식 -->
$(function() {
	$.ajax({
		url : "json.do",
		dataType : "json",
		success : function(result){
			 console.log(result)
			no = result.no
			title = result.title
			content = result.content
			writer = result.writer
			$('#d1').append(no+" , "+title+" , "+content+" , "+writer) 
		}
	
	})
})


</script>

<title>Insert title here</title>
</head>
<body>
<h3>JSON으로 값 받아오기</h3>
<hr>
<div id="d1"></div>
</body>
</html>