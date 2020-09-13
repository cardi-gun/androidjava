package 컬렉션;

import java.util.ArrayList;

import db연결.BbsVO;

public class 아무거나묶어보자 {
	
	public static void main(String[] args) {
		//리스트타입의 컬렉션, 배열의 업그래이드 버젼
		ArrayList list = new ArrayList();
		//집어 넣을때는 add(값)메서드 사용
		list.add(19);
		list.add("자바과정");
		list.add(25.5);
		list.add(false);
		list.add(new BbsVO());
		//list의 개수는 list.size();
		System.out.println( list.size() + "개 들어있음.");
		//꺼내 올 때는 get(index)메서드 사용
		System.out.println(list.get(0));//인덱스 가져오기
		System.out.println(list.get(1));//인덱스 가져오기
		//지울 때는 remove(index)메서드 사용
		list.remove(0);
		System.out.println( list.size() + "개 들어있음.");
		System.out.println(list.get(0));//인덱스 가져오기
		//0번을 지우면 1칸씩 당겨져서 1번이 0번이 된다.
		
		//중간에 끼워 넣을때는 add(끼워넣을 위치, 값)메서드 사용
		list.add(0, "김창희");
		System.out.println( list.size() + "개 들어있음.");
		System.out.println(list.get(0));//인덱스 가져오기
		System.out.println(list.get(1));//인덱스 가져오기
		//한칸씩 뒤로 밀린다
		
		//값을 변경할때는 set(변경할 위치, 값)메서드 사용
		list.set(0, "창희킴");
		System.out.println(list.get(0));//인덱스 가져오기

		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i +":"+ list.get(i));
		}
		
		
		
		
		
		
	}//main
}
