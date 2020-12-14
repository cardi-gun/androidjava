package com.mega.mvc05;

import org.springframework.stereotype.Component;

@Component
public class BSite implements BSiteInterface {
	@Override
	public void search() {
		System.out.println("검색 합니다");
	}
	@Override
	public void cart() {
		System.out.println("장바구니에 담습니다");
	}
	@Override
	public void orderby() {
		System.out.println("주문을 합니다");
	}
}
