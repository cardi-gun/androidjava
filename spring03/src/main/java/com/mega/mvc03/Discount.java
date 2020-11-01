package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Discount {

	@Autowired
	MemberDAO dao;
	
	public int discount(int price) {
		
		return price / 10 * 9;
	}
	
	public String[] sign(String id) {
		String[] idck = {"root","admin","apple","melon","mint"};
		String result = "사용가능";
		String color = "blue";
		for (int i = 0; i < idck.length; i++) {
			if (id.equals(idck[i])){
				result = "사용불가능";
				color = "red";
				break;
			}
		}
		String[] values = {result, color};
		return values;
	}
}
