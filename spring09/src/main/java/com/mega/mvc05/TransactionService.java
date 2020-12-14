package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {
	
	@Autowired
	MemberDAO mdao;
	@Autowired
	BbsDAO bdao;
	
	//트랜잭션으로 묶을 메서드 정의
	@Transactional
	public int tran(MemberVO mvo, BbsVO bvo) throws Exception{
		System.out.println("tran 메서드 - service호출");
		int result = 1;//성공
		mdao.insert(mvo);
		if( 0 == bdao.insert(bvo)) {
			System.out.println("bbs게시물 삽입시 에러 발생");
			result = 0;//실패
		}
		return result;
	}
	
}
