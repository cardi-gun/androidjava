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
	  $('#d1').empty()
      $.ajax({ //api의 주소
         url : "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=i1gpgchgw95nhvkorrnuhk4sptjfxy5cpyi40a8i",//member.xml과 연결
         data : {	//원래 url과 키, contents의양
        	 url : 'http://health.chosun.com/site/data/rss/rss.xml',
        	 api_key :'i1gpgchgw95nhvkorrnuhk4sptjfxy5cpyi40a8i',// 가져올 api의 키를넣어줘야 한다. 
        	 count : 20 
         },
         success: function(result) {
			console.log('성공'+result)
			list = result.items//items의 배열
			console.log(list.length)
			if (list.length >0 ) {
				$(list).each(function(index, news){
					title = news.title
					pubDate = news.pubDate
					link = news.link
					total = "<b><a href="+link+">"+title+"</a></b> : " + pubDate + "<br>" + "<a>"+link+"</a><br>"
					$('#d1').append(total+"<hr>")
					
					guid = news.guid,
					author = news.author,
					thumbnail = news.thumbnail,
					description = news.description,
					content = news.content,
					enclosure = news.enclosure,
					categories = news.categories
					
					$.ajax({//데이터를 보내기위해 ajax안에 ajax
						url:"db2.jsp", //db1에 연결
						data : { //key : value
							title : title,
							pubDate : pubDate,
							link : link,
							guid : guid,
							author : author,
							thumbnail : thumbnail,
							description : description,
							content : content,
							enclosure : enclosure,
							categories : categories
						},
						success: function(result) {//결과 출력
							console.log('db2.jsp를 통해서 db에 넣기- 성공적으로 전송함')
							console.log('결과는'+result)
						}
					})//ajax
				})//each
			}//if
		}//success
      })//ajax
   })//b1click
	$('#b2').click(function() {
		 $('#d1').empty()
		$.ajax({
			url : 'https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fbooks.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=i1gpgchgw95nhvkorrnuhk4sptjfxy5cpyi40a8i',
			data : {
				url : 'http://books.chosun.com/site/data/rss/rss.xml',
				api_key : 'i1gpgchgw95nhvkorrnuhk4sptjfxy5cpyi40a8i',
				count : 20
			},
			success: function(result) {
				console.log('성공'+result)
				list = result.items//items의 배열
				console.log(list.length)
				if (list.length >0 ) {
					$(list).each(function(index, news){
						title = news.title
						pubDate = news.pubDate
						link = news.link
						total = "<b><a href="+link+">"+title+"</a></b> : " + pubDate + "<br>" + "<a>"+link+"</a><br>"
						$('#d1').append(total+"<hr>")
					})//each
				}//if
			}//success
		})//ajax
	})//b2
   
	$('#b3').click(function() {
		  $('#d1').empty()
		$.ajax({
			url : 'https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fart.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=i1gpgchgw95nhvkorrnuhk4sptjfxy5cpyi40a8i',
			data : {
				url : 'http://art.chosun.com/site/data/rss/rss.xml',
				api_key : 'i1gpgchgw95nhvkorrnuhk4sptjfxy5cpyi40a8i',
				count : 20
			},
			success: function(result) {
				console.log('성공'+result)
				list = result.items//items의 배열
				console.log(list.length)
				if (list.length >0 ) {
					$(list).each(function(index, news){
						title = news.title
						pubDate = news.pubDate
						link = news.link
						total = "<b><a href="+link+">"+title+"</a></b> : " + pubDate + "<br>" + "<a>"+link+"</a><br>"
						$('#d1').append(total+"<hr>")
					})//each
				}//if
			}//success
		})//ajax
	})//b3
   
})

</script>
</head>
<body>
<button id="b1">헬스조선 연결</button>
<button id="b2">북스조선 연결</button>
<button id="b3">아트조선 연결</button>
<button id="b4">한경연예 연결</button>
<button id="b5">한경포토 연결</button>
<div id="d1"></div>
</body>
</html>