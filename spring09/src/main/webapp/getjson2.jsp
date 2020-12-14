<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>


<script type="text/javascript">
<!-- mvc1로 list를 받아오는 방식 -->
$(function() {
	$.ajax({
		url : "json.jsp",
		dataType : "json",
		success : function(result){
			console.log(result)
			array = result
			$(array).each(function(i, item) {
				console.log(item)
			console.log(item.id +" , "+item.pw+" , "+item.name +" , "+item.tel)
				$('#d1').append(item.id +" , "+item.pw+" , "+item.name +" , "+item.tel)
			}) 
		}
	
	})
})


</script>

<title>Insert title here</title>
</head>
<body>
<h3>array로 JSON 여러값 받아오기</h3>
<hr>
<div id="d1"></div>
</body>
</html>