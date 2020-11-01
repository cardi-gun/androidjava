package com.mega.mvc05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//싱글톤
public class BbsController {
	
	@Autowired
	BbsService service;
	
	@RequestMapping("review.do")
	public void review(BbsVO bbsVO, HttpSession session) {//프로토타입
		//입력값을 VO로 설정하는 경우
		//1) 객체생성 : prototype 방법
		//2) input name 속성과 동일한 set 메서드를 자동으로 호출
		//3) 변수 이름을 클래스이름의 첫글자를 소문자로 지정하는 경우 
		//   자동으로 VO를 model의 속성으로 지정해서
		//   views의 아래 jsp 파일에서 model속성값으로 꺼내서 쓸 수 있음.
		System.out.println(bbsVO.getNo());
		System.out.println(bbsVO.getTitle());
		System.out.println(bbsVO.getContent());
		System.out.println(bbsVO.getWriter());
		
		//모델은 한번의 request당 한번의 response를 하고 사라진다.
		//여러번의 request마다 특정 값을 유지하고 사용하고 싶다면
		//session으로 설정해야 한다.
		//session.setAttribute("no", bbsVO.getNo());
		session.setAttribute("bbsVO2", bbsVO);
		service.create(bbsVO);
	}
	
	@RequestMapping("update.do")
	public void update(Model model) {
		//DB에서 처리가 들어가야 하는 경우 반드시 컨트롤러를 거쳐야한다.*
		//DB 검색해서 가지고 온뒤 
		//검색한 결과를 view에 있는 update.jsp로 이동한다.
		//컨트롤러를 반드시 지나가야한다.
		System.out.println("컨트롤러를 방문했습니다.");
		model.addAttribute("result", "검색결과 입니다.");
	}
	@RequestMapping("delete.do")
	public void delete(Model model) {
		//DB처리하고 views로 넘어간다.
		System.out.println("컨트롤러를 방문했습니다.2");
		
	}
	
	
}
