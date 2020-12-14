package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//자신의 위치, 어떤건지 명시
@Controller
public class MemberController {
	
	//싱글톤으로 가져온다.
	@Autowired
	MemberService servise;
	
	//webapp에서 실행한 파일 안 코드와 맵핑
	@RequestMapping("create2.do")
	public void create2(MemberVO memberVO) {
		servise.insert(memberVO);
		
	}
	@RequestMapping("delete2.do")
	public void delete2(MemberVO memverVO) {
		servise.delete(memverVO);
	}
	@RequestMapping("update2.do")
	public void update2(MemberVO memverVO) {
		servise.update(memverVO);
	}
	@RequestMapping("one2.do")
	public void one2(MemberVO memverVO, Model model) {
		//입력값과 결과값이 다르기 때문에 
		MemberVO vo = servise.one(memverVO);
		//모델로 넘기기, 모델로 넘기기 때문에 출력시 vo 모델로 찍어야한다.
		model.addAttribute("vo", vo);
	}

	@RequestMapping("list2.do")
	public void list2(Model model) {
		List<MemberVO> list = servise.list();
		model.addAttribute("list", list);
	}
	
}
