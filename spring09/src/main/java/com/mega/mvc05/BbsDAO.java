package com.mega.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate mybatis;

	public int insert(BbsVO vo) throws Exception{
		return mybatis.insert("bbs.create", vo);
		
	}
	
	public BbsVO select(BbsVO vo) {
		BbsVO vo2 = mybatis.selectOne("bbs.one", vo);
		System.out.println("게시글 출력");
		System.out.println(vo2);
		return vo2;
	}

	public List<BbsVO> list() {
		List<BbsVO> list = mybatis.selectList("bbs.list");
		return list;
	}

	public void delete(BbsVO vo) {
		mybatis.delete("bbs.delete",vo);
	}

	public void update(BbsVO vo) {
		mybatis.update("bbs.update",vo);
	}

}
