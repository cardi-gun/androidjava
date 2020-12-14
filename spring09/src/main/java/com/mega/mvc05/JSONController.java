package com.mega.mvc05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {

	@Autowired
	BbsService service;
	
	
	@RequestMapping("json.do")
	@ResponseBody
	public BbsVO json() {
		BbsVO vo = new BbsVO();
		vo.setNo(100);
		vo.setTitle("coffee");
		vo.setContent("good");
		vo.setWriter("park");
		
		return vo;
	}
	
	@RequestMapping("json2.do")
	@ResponseBody
	public ArrayList<BbsVO> json2() {
		BbsVO vo = new BbsVO();
		vo.setNo(100);
		vo.setTitle("coffee");
		vo.setContent("good");
		vo.setWriter("park");
		
		BbsVO vo2 = new BbsVO();
		vo2.setNo(200);
		vo2.setTitle("tea");
		vo2.setContent("soso");
		vo2.setWriter("kim");
		
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(vo);		
		list.add(vo2);		
		
		return list;
	}

	@RequestMapping("json3.do")
	@ResponseBody
	public BbsVO json3(String No) {
		int no = Integer.parseInt(No);
		BbsVO vo = new BbsVO();
		vo.setNo(no);	
		return service.one(vo);
		
	}
	
	
	@RequestMapping("json4.do")
	@ResponseBody
	public List<BbsVO> json4() {
		return service.list();
		
	}
	
	
	
	
}



















