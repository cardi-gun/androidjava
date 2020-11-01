package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("insert.do")
	private void member(String id,String pw,String name,String tel) {
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		System.out.println(tel);
		
		String result ="회원 가입 실패";
		if (id.equals("root") && pw.equals("1234")) {
			result = "회원 가입 성공";
			
		}
	}
}
