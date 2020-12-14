package com.mega.mvc07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//자신의 위치, 어떤건지 명시
//DAO는 repository로 명시 (부모는 @component이지만 더 많은 기술을 쓰기 위해 상속받은 repostitory를 쓴다.)

//@Bean 상속
//@component 상속
@Repository
public class MemberDAO {
	
	//mybatis 가져오기
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(MemberVO vo) {
		mybatis.insert("member.insert",vo);
	}
	
	public int delete(MemberVO vo) {
		int result = mybatis.delete("member.delete",vo);
		System.out.println("result : " + result);
		return result;
	}

	public int update(MemberVO vo) {
		int result = mybatis.update("member.update",vo);
		System.out.println("result : " + result);
		return result;
	}
	
	public MemberVO one(MemberVO vo) {
		//mybatis.selectOne("네임스페이스.id", 입력파라메터);
		MemberVO vo2 = mybatis.selectOne("member.one", vo);
		return vo2;
	}
	
	public List<MemberVO> list() {
		List<MemberVO> list = mybatis.selectList("member.list");
		System.out.println("list size : " + list.size());
		return list;
		
	}
	
}
