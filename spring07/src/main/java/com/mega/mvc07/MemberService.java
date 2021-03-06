package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//자신의 위치, 어떤건지 명시
@Service
public class MemberService {

	//싱글톤으로 가져온다.
	@Autowired
	MemberDAO dao;
	
	public void insert(MemberVO vo) {
		dao.insert(vo);
	}

	public void delete(MemberVO vo) {
		dao.delete(vo);
	}
	
	public void update(MemberVO vo) {
		dao.update(vo);
	}

	public MemberVO one(MemberVO vo) {
		return dao.one(vo);
	}
	
	public List<MemberVO> list() {
		return dao.list();
	}
	
}
