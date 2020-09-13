package db연결;

import java.util.ArrayList;

public class 게시판전체목록프린트 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BbsDAO dao = new BbsDAO();
		ArrayList<BbsVO> list = dao.all();
		System.out.println("게시판 개수 : " + list.size()+ "개");
		System.out.println("NO"+"\t"+"TITLE"+"\t"+"CONTENT"+"\t"+"WRITER");
		for (int i = 0; i < list.size(); i++) {
			//list에 들어있는 가방을 하나씩 가져온다.
			BbsVO bag = list.get(i);
			System.out.println(bag.getNo()+"\t"+bag.getTitle()+"\t"+bag.getContent()+"\t"+bag.getWriter());
			System.out.println("");
		}
		
	}

}
