package 컬렉션;

import java.util.ArrayList;

public class 달리기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1등 박소정 2등 김정민 3등 소지현 4등 김개념
		
		ArrayList run = new ArrayList();
		run.add("박소정");
		run.add("김정민");
		run.add("소지현");
		run.add("김개념");
		
		System.out.println(run);
		System.out.println("--------------------");
		//2등이 반칙,
		run.remove(1);
		System.out.println(run);
		System.out.println("--------------------");

		for (int i = 0; i < run.size(); i++) {
			System.out.println((i+1)+"등은 "+ run.get(i)+"입니다.");
		}
		
	}

}
