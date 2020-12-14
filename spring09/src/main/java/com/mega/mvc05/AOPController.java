package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPController {
	
	@Autowired
	ASiteInterface a;
	
	@Autowired
	BSiteInterface b;
	
	@Autowired
	AOPService service;
	
	@RequestMapping("aopError.do")
	public void aop5(){
		try {
			service.error();
		} catch (Exception e) {

		}
	}
	
	@RequestMapping("a.do")
	public void aop1() {
		a.person();
	}
	
	@RequestMapping("b1.do")
	public void aop2() {
		b.search();
	}
	
	@RequestMapping("b2.do")
	public void aop3() {
		b.cart();
	}
	
	@RequestMapping("b3.do")
	public void aop4() {
		b.orderby();
	}
	
	
}
