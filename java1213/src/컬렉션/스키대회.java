package 컬렉션;

import java.util.ArrayList;

public class 스키대회 {

	public static void main(String[] args) {
		//스키대회 수상자 리스트 
		ArrayList ski = new ArrayList();
		
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		
		//2번째 탈락
		ski.remove(1);
		
		for (int i = 0; i < ski.size(); i++) {
			System.out.println((i+1) +"등은 "+ ski.get(i));
		}
		
	}//main

}
