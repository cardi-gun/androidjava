package com.mega.mvc05;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mailcontroller {
	
	@Autowired
	Mailservice service;
	
	@RequestMapping(value = "/mail/mailSending", method =  RequestMethod.POST)
	public void mailSending(HttpServletRequest request) {
		
		System.out.println("메일 컨트롤러를 호출함");
		service.mailSend(request);
	}
}
