<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<tr style="background: lime">
	<%-- <td style="width: 50px;">${vo.no}</td> --%>
	<%-- <td style="width: 50px;">${status.index+1}</td> --%>
	<td style="width: 50px;">${status.index+1}</td>
	<td style="width: 300px;">${replyVO.content}</td>
	<td style="width: 100px;">${replyVO.writer}</td>
	<td style="width: 100px;">
		<!--  one.do?no=1  --> <a
		href="delete3.do?no=${replyVO.no}&original=${replyVO.original}">
			<button style="background: yellow;">삭제</button>
	</a>
	</td>
</tr>