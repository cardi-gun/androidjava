<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h3>여기 까지 잘 왔네 처음으로 돌아가세</h3>
<button id="back">돌아가기</button>
<script type="text/javascript">
$(function() {
	$('#back').click(function() {
        location.href = "index.jsp";
	})
})
</script>
</body>
</html>