package 컬렉션;

import java.util.LinkedList;

public class 큐형태 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 큐형태 리스트
		LinkedList milk = new LinkedList();
		milk.add("상한유우");
		milk.add("싱싱유우");
		milk.add("내일우유");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}

		// arraylist와 비슷하지만 삭제를 하면
		// 가장 앞의 데이터가 삭제된다.
		System.out.println("------------------------------");

		milk.remove();
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		// 가장 앞의 데이터가 삭제된다.
		System.out.println("------------------------------");

		milk.remove();
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		
		System.out.println(milk);
		
	}//main

}
