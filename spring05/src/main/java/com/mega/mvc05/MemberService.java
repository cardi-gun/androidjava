package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;

	public MemberService(MemberDAO dao) {
		this.dao = dao;
	}

	public void create(MemberVO vo) {
		dao.insert(vo);
	}
}
