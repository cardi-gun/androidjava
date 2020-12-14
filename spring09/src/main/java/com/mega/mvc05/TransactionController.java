package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@RequestMapping("transaction.do")
	public void transaction(BbsVO bbsvo, MemberVO membervo, Model model) {
		System.out.println("transactio");
		System.out.println(bbsvo);
		System.out.println(membervo);
		
		int result = 0;// 에러가 있을 때 0
		try {
			result = service.tran(membervo, bbsvo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("결과 받은값>>" + result);
		
		if(result == 1 ) {
			model.addAttribute("result","모든 db처리 성공, commit됨");
		}else {
			model.addAttribute("result","db처리중 에러발생, rollback됨");
			
		}
	}
	
}
