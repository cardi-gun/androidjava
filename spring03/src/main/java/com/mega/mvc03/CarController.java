package com.mega.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//일반 자바 파일 : POJO
//Controller기능을 가진 클래스로 만들고 싶으면, 상속을 받아야하지만
//스프링이 업그래이드 되면서 @(어노테이션)으로 처리한다.

//@Controller를 쓰면 내부적으로 벌어지는 일
//1) 상속 2)핸들러맵퍼에 key(요청 되는 주소) :value (객체의 매소드)를 등록

@Controller
public class CarController {
	
	@RequestMapping("car2.do")
	
	
	//컨트롤러에서 view까지 넘어가기 위한 항목
	//1) 넘어갈 view페이지 지정
	//2) model의 속성값
	//Spring 5.0대에서는 모델과 view를 따로 넘길수 있다.
	
	//public void car(httpHttpServletRequest) {
	//public void car(@RequestParam("color") String col) {
	// || 같은 방식
	public String car(String color, Model model) {//was에서 사용되는 세션과 비슷한 값
		System.out.println("컨트롤러에서 받은 색은" + color);
		//model에 color을 집어 넣는다.
		model.addAttribute("color", color);
		return "img";//view에 있는 img파일을 리턴=> 리턴할 페이지를 저장해줘야한다.
	}

}
