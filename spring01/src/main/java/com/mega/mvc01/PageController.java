package com.mega.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	//2. 컨트롤러에서 받는 메서드 만들기
	//page2.mega가 호출이 되면 자동으로 아래 메서드가 호출된다.
	@RequestMapping("page2.mega")
	public void page2(String id, String pw, Model model) {//받을 파라메타를 알아서 지정해주고 값을 넣어준다.
		System.out.println("메서드가 자동호출됩니다");
		System.out.println("컨트롤러에서 받은 id : "+id);
		System.out.println("컨트롤러에서 받은 pw : "+pw);
		//3. DAO 객체 사용해서 DB처리
		String result = "로그인 실패";
	    if(id.equals("root")&& pw.equals("1234")){
	    	result = "로그인 성공";
	    }
		//4. 처리 결과를 가지고 view에 해당하는 jsp페이지로 이동해준다.
	    model.addAttribute("result",result);
	}
}
