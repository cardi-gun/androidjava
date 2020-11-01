<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- css 링크 -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<!-- 제이쿼리 링크 -->
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<!-- 부트스트랩 CDN -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"
	integrity="sha384-LtrjvnR4Twt/qOuYxE721u19sVFLVSA4hf/rRt6PrZTmiPltdZcI7q7PXQBYTKyf"
	crossorigin="anonymous"></script>
<!-- 콜백함수 구현부 -->
<script type="text/javascript">

</script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="#">Navbar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Features</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
				<li class="nav-item"><a class="nav-link" href="#">About</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
					role="button" aria-haspopup="true" aria-expanded="false">Dropdown</a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a> <a
							class="dropdown-item" href="#">Something else here</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Separated link</a>
					</div></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search">
				<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<div class="search">
		<div class="inbox">
			<div class="left">요일</div>
			<div class="right">
				<div class="days">
					<ul id="days">
						<li day="1" class="">월</li>
						<li day="2" class="">화</li>
						<li day="3" class="">수</li>
						<li day="4" class="">목</li>
						<li day="5" class="">금</li>
						<li day="6" class="">토</li>
						<li day="0" class="">일</li>
					</ul>
				</div>
			</div>
		</div>

		<div class="inbox">
			<div class="left">시간</div>
			<div class="right">
				<div class="days">
					<ul id="times">
						<li time="8" class="">8시</li>
						<li time="10" class="">10시</li>
						<li time="12" class="">12시</li>
						<li time="14" class="">14시</li>
						<li time="16" class="">16시</li>
						<li time="18" class="">18시</li>
						<li time="20" class="">20시</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="right" id="search">내게 맞는 수업 보기</div>
	</div>

	<script type="text/javascript">
	


        

    var daycount = 0;
    var timecount = 0;
	
	 $(function(){
         $('li','#days').click(function(){
             if($(this).hasClass('on') == false && daycount == 0 ){
                 $(this).addClass('on');
                 $(this).css('background-color','#eb6864')
                 $(this).css('color','#ffffff')
                 daycount++;
             }else if($(this).hasClass('on') && daycount == 1){
                 $(this).removeClass('on');
                 $(this).css('background-color','#ffffff')
                 $(this).css('color','#000000')
                 daycount--;
             }else{
            	 alert("날짜를 하루만 선택해주세요")
             }
         });//days
         
         $('li','#times').click(function(){
             if($(this).hasClass('on') == false && timecount == 0 ){
                 $(this).addClass('on');
                 $(this).css('background-color','#eb6864')
                 $(this).css('color','#ffffff')
                 timecount++;
             }else if($(this).hasClass('on') && timecount == 1){
                 $(this).removeClass('on');
                 $(this).css('background-color','#ffffff')
                 $(this).css('color','#000000')
                 timecount--;
             }else{
            	 alert("시간을 하나만 선택해주세요")
             }
         });//times

     
     
     
 $('#search').click(function(){
       if(daycount == 1 && timecount == 1){
           var day = "";
           var time = "";
        $("#days").children().each(function(){
            if($(this).hasClass('on')){
                if(day=='')
                {
                    day = $(this).attr("day");
                }
                else
                {
                    day = day + "," + $(this).attr("day");
                }
            }
        });

        $("#times").children().each(function(){
            if($(this).hasClass('on')){
                if(time=='')
                {
                    time = $(this).attr("time");
                }
                else
                {
                    time = time + "," + $(this).attr("time");
                }
            }
        });
        //cType을 받아온다.
        type = '<%=request.getParameter("cType")%>'
        url = 'List.jsp'
        console.log(type)
        location.href = url+"?cType="+type+"&day="+day+"&time="+time;
     
       }else{
    	   alert("시간과 요일을 선택해주세요")
       }
       
          });//search 
          
	 });//function 
     
	 $("#session").click(function() {
<%
session.setAttribute("id", "abc"); 
session.setAttribute("group", "teacher"); 
response.sendRedirect("Main.jsp");
%>		
	})
	 
	 
	</script>


<div>
<button id="session">로그인</button>
</div>






</body>
</html>