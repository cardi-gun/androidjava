package com.mega.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
	@Autowired
	BbsDAO dao; // 전역변수
	// 전역변수의 주소/값을 넣는 방법
	// 1. 파라메터 있는 생성자를 사용해서 넣는다.
	// 2. set메서드를 사용해서 넣는다.

	public BbsVO one(BbsVO vo) {
		return dao.select(vo);
	}
	
	public List<BbsVO> list() {	
		return dao.list();
	}
	
	
	public BbsService(BbsDAO dao) {
		this.dao = dao;
	}
	
	public void create(BbsVO vo) {
		try {
			int result = dao.insert(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
