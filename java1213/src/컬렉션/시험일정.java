package 컬렉션;

import java.util.LinkedList;

public class 시험일정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//큐형태 - linkedlist
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println("전체 시험 과목");
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i)+" ");
		}
		System.out.println(" ");
		System.out.println("--------------------");
		
		for (int i = 0; i < test.size()+1; i++) {
			test.remove();
			System.out.print((i+1)+"일차 시험본 후 남은 과목 : ");
			for (int j = 0; j < test.size(); j++) {
				System.out.print(test.get(j)+" ");
			}
			System.out.println(" ");
		}
	}

}
