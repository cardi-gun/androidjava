package 클래스사용하기;

import 클래스만들기.Bbs;

public class 게시판작성 {

	public static void main(String[] args) {
		Bbs b1 = new Bbs();
		b1.id =1;
		b1.title="java";
		b1.content="fun java";
		b1.writer="park";
		
		Bbs b2 = new Bbs();
		b2.id =2;
		b2.title="jsp";
		b2.content="fun jsp";
		b2.writer="kim";
		
		System.out.println("id, title, content, writer");
		System.out.println("------------------------------");
		System.out.println(b1);
		System.out.println(b2);
		b1.create();
		b2.delete();
		
	}

}
