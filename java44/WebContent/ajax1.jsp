<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js">
//제이쿼리 호출용
</script>
<script type="text/javascript">
//콜백함수(call-back함수)
//특정한 이벤트를 기다렸다가 그 이벤트가 발생하면
//함수가 정의되어 있는 곳으로 돌아가 자동 호출되는 함수
//body의 하위 엘리먼트를 먼저 브라우저가 dom-tree를 구성한 후
//함수를 정의하게 되어있음.
//브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라
//body부분을 먼저 읽어서 dom-tree를 만들도록 해야함.
$(function() {
   $('#b1').click(function() {
      $.ajax({
         url : "data/member.xml",//member.xml과 연결
         success: function(doc) {
			console.log('XML 요청 성공!')
			console.log('XML결과 : ' + doc)
			list = $(doc).find('record') //문서전체(=xml파일)에서 recode태그를 찾는 api
			console.log('레코드의 개수 : '+list.length) //list의 길이 = 100
			if(list.length >0){ //0보다 클때
				$(list).each(function(index, item) {//list의 길이만큼 반복,for-each문과 같음 // item = list
					id = $(item).find('id').text() //list안의 'id'값을 id에 저장
					first_name = $(item).find('first_name').text()
					last_name = $(item).find('last_name').text()
					email = $(item).find('email').text()
					gender = $(item).find('gender').text()
					ip_address = $(item).find('ip_address').text()
					//console.log(index+'first_name : '+ first_name)//출력 확인용 
					$('#d1').append(id + first_name + last_name + email + gender + ip_address + '<br><br>')
					//d1에 각 데이터를 입력하고 하단에 추가
					$.ajax({//데이터를 보내기위해 ajax안에 ajax
						url:"db1.jsp", //db1에 연결
						data : { //key : value
							id : id, //키id에 id를 값을 전달 
							first_name : first_name,
							last_name : last_name,
							email : email,
							gender : gender,
							ip_address : ip_address
						},
						success: function(result) {//결과 출력
							console.log('db1.jsp를 통해서 db에 넣기- 성공적으로 전송함')
							console.log('결과는'+result)
						}
					})//ajax
				})//foreach
			}//if
		}//success
      })//ajax
   })//b1click
   $('#b2').click(function() {
	   $.ajax({
	         url : "data/member.json",//json파일 가져오기
	         success: function(doc) {
				console.log(doc)
				$(doc).each(function(index, item) {
					console.log(index + ": "+ item.id)
					id = item.id
					first_name = item.first_name
					last_name = item.last_name
					email = item.email
					gender = item.gender
					ip_address = item.ip_address
					
					$('#d1').append(id + first_name + last_name + email + gender + ip_address + '<br>')

					
				})//foreach
			}//success
	      })//ajax
   })//b2click
   $('#b3').click(function() {
      
   })
})

</script>
</head>
<body>
<button id="b1">XML읽어오기</button>
<button id="b2">JOSN읽어오기</button>
<button id="b3">DB에넣기</button>
<div id="d1"></div>
</body>
</html>