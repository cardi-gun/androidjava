<%@page import="java.util.List"%>
<%@page import="BCbean.ClassVO"%>
<%@page import="BCbean.ClassDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>









<%


//원본파일이다 진짜 잘못되면 죽는거야


List<ClassVO> list = null;
String cType = request.getParameter("cType");
String cDay = request.getParameter("cDay");
String cTime = request.getParameter("cTime");

String Search = request.getParameter("Search");

//요일별 시간별 정리용
/* String cDay = request.getParameter("cDay");
String cTime = request.getParameter("cTime"); */

ClassDAO classdao = new ClassDAO();
String all ="전체";
/*
  if (cType != null) {
	list = classdao.typeread(cType);
} else {
	list = classdao.recentread();
}  

*/
if (cType != null) {

	//list = classdao(Search);
	if (cType.equals(all)) {
		if (cTime != null) {
		list = classdao.conditionread(cDay, cTime);
		System.out.println("시간별 출력되었음");
		} else {
		list = classdao.bestread();
		System.out.println("전체 출력되었음");
		}

	} else {
		if (cTime != null) {
		list = classdao.conditionread(cType, cDay, cTime);
		System.out.println("시간별 출력되었음");
		} else {
		list = classdao.typeread(cType);
		System.out.println("카테별 출력되었음");
		}
	}

} else {
	list = classdao.searchread(Search);
	System.out.println(Search);
	System.out.println("검색 출력되었음");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
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
	<!-- header부분 삽입 -->
	<jsp:include page="Header.jsp"></jsp:include>



	<div class="search">
		<div class="inbox">
			<div class="left">요일</div>
			<div class="right">
				<div class="days">
					<ul id="days">
						<li day="월" class="">월</li>
						<li day="화" class="">화</li>
						<li day="수" class="">수</li>
						<li day="목" class="">목</li>
						<li day="금" class="">금</li>
						<li day="토" class="">토</li>
						<li day="일" class="">일</li>
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
	

 	
   /*   
	//클래스를 추가 하고 css변경하는 함수
	 $(function(){
         $('li','.days').click(function(){
             if($(this).hasClass('on')){
                 $(this).removeClass('on');
                 $(this).css('background-color','#ffffff')
                 $(this).css('color','#000000')
             }else{
                 $(this).addClass('on');
                 $(this).css('background-color','#eb6864')
                 $(this).css('color','#ffffff')
             }
         });//days
     });//function	
	})  */
	
	//항목당 하나씩만 선택할수있게 지정

		var daycount = 0;
		var timecount = 0;

		$(function() {
			$('li', '#days').click(function() {
				if ($(this).hasClass('on') == false && daycount == 0) {
					$(this).addClass('on');
					$(this).css('background-color', '#eb6864')
					$(this).css('color', '#ffffff')
					daycount++;
				} else if ($(this).hasClass('on') && daycount == 1) {
					$(this).removeClass('on');
					$(this).css('background-color', '#ffffff')
					$(this).css('color', '#000000')
					daycount--;
				} else {
					alert("날짜를 하루만 선택해주세요")
				}
			});//days

			$('li', '#times').click(function() {
				if ($(this).hasClass('on') == false && timecount == 0) {
					$(this).addClass('on');
					$(this).css('background-color', '#eb6864')
					$(this).css('color', '#ffffff')
					timecount++;
				} else if ($(this).hasClass('on') && timecount == 1) {
					$(this).removeClass('on');
					$(this).css('background-color', '#ffffff')
					$(this).css('color', '#000000')
					timecount--;
				} else {
					alert("시간을 하나만 선택해주세요")
				}
			});//times

			//검색을 눌렀을 때 원하는 날짜, 시간조건에 맞는 데이터 페이지 이동
			$('#search').click(
					function() {
						if (daycount == 1 && timecount == 1) {
							var day = "";
							var time = "";
							$("#days").children().each(function() {
								if ($(this).hasClass('on')) {
									if (day == '') {
										day = $(this).attr("day");
									} else {
										day = day + "," + $(this).attr("day");
									}
								}
							});

							$("#times").children().each(
									function() {
										if ($(this).hasClass('on')) {
											if (time == '') {
												time = $(this).attr("time");
											} else {
												time = time + ","
														+ $(this).attr("time");
											}
										}
									});
							//원하는 조건에 맞는 데이터 출력
							//cType을 받아온다.
			type = '<%=request.getParameter("cType")%>'
	        url = 'List.jsp'
	        console.log(type)
	        location.href = url+"?cType="+type+"&cDay="+day+"&cTime="+time;
		} else {
							alert("시간과 요일을 선택해주세요")
						}
					});//search
		});//function
	</script>

	<div class="content">
		<%if(list.size() == 0){
				%>
				<div><h3>요청하신 요일,시간에 강의가 없습니다.</h3></div>
				
				<%
				
			}else{
			for (int i = 0; i < list.size(); i++) {
			ClassVO vo = list.get(i);
			
			
		%>
		<div class="content">
			<img alt="" src="images/<%=vo.getcImg()%>">
			<div><%=vo.getcTitle()%></div>
			<div><%=vo.getcPrice()%></div>
		</div>
		<%
		System.out.println("출력되었음");
			}}
		%>
	</div>

	<!-- 다음화면클릭 -->
	<div>
		<ul class="pagination">
			<li class="page-item disabled"><a class="page-link" href="#">&laquo;</a>
			</li>
			<li class="page-item active"><a class="page-link" href="#">1</a>
			</li>
			<li class="page-item"><a class="page-link" href="#">2</a></li>
			<li class="page-item"><a class="page-link" href="#">3</a></li>
			<li class="page-item"><a class="page-link" href="#">4</a></li>
			<li class="page-item"><a class="page-link" href="#">5</a></li>
			<li class="page-item"><a class="page-link" href="#">&raquo;</a>
			</li>
		</ul>
	</div>

	<!-- footer부분 삽입 -->
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>




<!-- list 2차 -->
<%-- /*


<%@page import="java.util.List"%>
<%@page import="BCbean.ClassVO"%>
<%@page import="BCbean.ClassDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	List<ClassVO> list = null;
	List<ClassVO> listlength = null;
	int length = 0 ;
	
String cType = request.getParameter("cType");
String cDay = request.getParameter("cDay");
String cTime = request.getParameter("cTime");

String stringPage = request.getParameter("ListPage");
int ListPage = Integer.parseInt(stringPage);

int PageLimit = 9;
int LastNum = ListPage * PageLimit;
int StartNum = LastNum - 8;
int OffsetNum = StartNum - 1;

String Search = request.getParameter("Search");

//요일별 시간별 정리용
/* String cDay = request.getParameter("cDay");
String cTime = request.getParameter("cTime"); */

ClassDAO classdao = new ClassDAO();
String all ="전체";
/*
  if (cType != null) {
	list = classdao.typeread(cType);
} else {
	list = classdao.recentread();
}  

*/




if (cType != null) {
	if (cType.matches(all)) {
		if (cTime != null){
			list = classdao.conditionread(cDay, cTime, OffsetNum);
			listlength = classdao.conditionread(cDay, cTime);
			length = listlength.size();
			System.out.println("위에 시간별 출력되었음");	
		} else {
			list = classdao.bestread(StartNum, LastNum);
			listlength = classdao.bestread();
			length = listlength.size();
			System.out.println("전체 출력되었음");
		}
	} else {
		if (cTime != null) {
			list = classdao.conditionread(cType, cDay, cTime, OffsetNum);
			listlength = classdao.conditionread(cType, cDay, cTime);
			length = listlength.size();
			System.out.println("아래 시간별 출력되었음");
		} else {
			list = classdao.typeread(cType, OffsetNum);			
			listlength = classdao.typeread(cType);
			length = listlength.size();
			System.out.println("카테별 출력되었음");
		}
	}
} else {
	list = classdao.searchread(Search, OffsetNum);
	listlength = classdao.searchread(Search);
	length = listlength.size();
	System.out.println(Search);
	System.out.println("검색 출력되었음");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
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
	<!-- header부분 삽입 -->
	<jsp:include page="Header.jsp"></jsp:include>
	
<!-- 리스트 요일, 시간 검색 목록 -->
	<div class="search">
		<div class="inbox">
			<div class="left">요일</div>
			<div class="right">
				<div class="days">
					<ul id="days">
						<li day="월" class="">월</li>
						<li day="화" class="">화</li>
						<li day="수" class="">수</li>
						<li day="목" class="">목</li>
						<li day="금" class="">금</li>
						<li day="토" class="">토</li>
						<li day="일" class="">일</li>
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

	//시간, 날짜 항목당 하나씩만 선택할수있게 지정
		var daycount = 0;
		var timecount = 0;

		$(function() {
			$('li', '#days').click(function() {
				if ($(this).hasClass('on') == false && daycount == 0) {
					$(this).addClass('on');
					$(this).css('background-color', '#eb6864')
					$(this).css('color', '#ffffff')
					daycount++;
				} else if ($(this).hasClass('on') && daycount == 1) {
					$(this).removeClass('on');
					$(this).css('background-color', '#ffffff')
					$(this).css('color', '#000000')
					daycount--;
				} else {
					alert("날짜를 하루만 선택해주세요")
				}
			});//days

			$('li', '#times').click(function() {
				if ($(this).hasClass('on') == false && timecount == 0) {
					$(this).addClass('on');
					$(this).css('background-color', '#eb6864')
					$(this).css('color', '#ffffff')
					timecount++;
				} else if ($(this).hasClass('on') && timecount == 1) {
					$(this).removeClass('on');
					$(this).css('background-color', '#ffffff')
					$(this).css('color', '#000000')
					timecount--;
				} else {
					alert("시간을 하나만 선택해주세요")
				}
			});//times

			//검색을 눌렀을 때 원하는 날짜, 시간조건에 맞는 데이터 페이지 이동
			$('#search').click(
					function() {
						if (daycount == 1 && timecount == 1) {
							var day = "";
							var time = "";
							$("#days").children().each(function() {
								if ($(this).hasClass('on')) {
									if (day == '') {
										day = $(this).attr("day");
									} else {
										day = day + "," + $(this).attr("day");
									}
								}
							});

							$("#times").children().each(
									function() {
										if ($(this).hasClass('on')) {
											if (time == '') {
												time = $(this).attr("time");
											} else {
												time = time + ","
														+ $(this).attr("time");
											}
										}
									});
							//원하는 조건에 맞는 데이터 출력
							//cType을 받아온다.
	        url = 'List.jsp'
			type = '<%=request.getParameter("cType")%>'
	        console.log(type)
	        resetPage = 1;
	        location.href = url+"?cType="+type+"&cDay="+day+"&cTime="+time+"&ListPage="+resetPage;
	        
		} else {
							alert("시간과 요일을 선택해주세요")
						}
					});//search
		});//function

		
		$(function() {
			$('.page-link').click(function() {
				var path3 = <%= request.getRequestURL()%>
				console.log(path3);
				console.log($(this).text());
				url = 'List.jsp'
				type = <%=request.getParameter("cType")%>
				day = <%=request.getParameter("cDay")%>
				time = <%=request.getParameter("cTime")%>
				location.href = url+"?cType='"+<%=request.getParameter("cType")%>+"'&cDay='"+<%=request.getParameter("cDay")%>+"'&cTime='"+<%=request.getParameter("cTime")%>+"'&ListPage="+$(this).text();
			})
		})
	</script>




	<div class="content">
		<%
			if (length == 0) {
				System.out.println("brake 출력되었음");

		%>
		<div>
			<h3>요청하신 요일,시간에 강의가 없습니다.</h3>
		</div>

		<%
			} else {
		if ((length - (LastNum-PageLimit)) > PageLimit) {
			System.out.println("brake0 출력되었음");

			for (int i = 0; i < 9; i++) {
				ClassVO vo = list.get(i);			
				System.out.println("brake1 출력되었음");

		%>
		<div class="content">
			<img alt="" src="images/<%=vo.getcImg()%>">
			<div><%=vo.getcTitle()%></div>
			<div><%=vo.getcPrice()%></div>
		</div>
		<%
			System.out.println("brake2 출력되었음");
		}
		} else {
		for (int i = 0; i < (length%9); i++) {
		ClassVO vo = list.get(i);
		%>
		<div class="content">
			<img alt="" src="images/<%=vo.getcImg()%>">
			<div><%=vo.getcTitle()%></div>
			<div><%=vo.getcPrice()%></div>
		</div>
		<%
			System.out.println("남은거 출력되었음");

			}
		}
		}
		%>
	</div>

	<!-- 다음화면클릭 -->
	<%
	if((length/PageLimit)>= 1){
	%>
	<div>
		<ul class="pagination">
			<!-- <li class="page-item disabled"><a class="page-link" href="">&laquo;</a>
			</li> -->
			<% 
			for(int i = 0; i <(length/PageLimit) + 1; i++){
			%>
			<li class="page-item" value="<%=(i+1)%>"><a class="page-link" href="List.jsp?cType=<%=request.getParameter("cType")%>
			&Search=<%=request.getParameter("Search")%>&ListPage=<%=(i+1)%>"><%=(i+1)%></a></li>
			<% 
			}
			%>
			
			<!-- <li class="page-item"><a class="page-link" href="">&raquo;</a>
			</li> -->
		</ul>
	</div>
	<%} %>
	<!-- footer부분 삽입 -->
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>

*/ --%>