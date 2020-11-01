package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	//지정한 변수에 주소값에 전달 => 싱글톤
	Discount service;
	
	@RequestMapping("movie.do")
	public String movie(String title, int price, Model model) {
		System.out.println(title);
		System.out.println(price);
		
		
		int total = service.discount(price);
		
		model.addAttribute("title", title);
		model.addAttribute("price", total);
		return "like";
	}
	
	@RequestMapping("reply.do")
	public void reply(String reply, Model model) {
		//서비스단 거쳐 DB 처리 후
		model.addAttribute("reply", reply);
	}
	
	@RequestMapping("sign.do")
	public void sign(String id, Model model) {
		String[] values = service.sign(id);
		model.addAttribute("result", values[0]);
		model.addAttribute("color", values[1]);
		
	}
	
}
