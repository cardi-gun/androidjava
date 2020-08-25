package 영화예매배열;

import java.util.Scanner;

public class 콘솔입력 {

	public static void main(String[] args) {
		// 콘솔에서 입력받기: scanner!!
		// 모든 입력의 데이터 타입은 String이다.
		Scanner scan = new Scanner(System.in);
		// 키보드를 통해서 입력받는다.
		System.out.print("이름을 입력하세요 >>");
		String text1 = scan.next();
		System.out.println("이름 : " + text1);

		System.out.print("나이를 입력하세요 >>");
		int text2 = scan.nextInt();
		System.out.println("나이 : " + text2);

		System.out.print("현재 키를 입력하세요 >>");
		double text3 = scan.nextDouble();
		System.out.println("내년 키는 : " + (text3 + 20));

		System.out.print("밖에 비가 오나요? true/false >>");
		boolean text4 = scan.nextBoolean();
		if (text4) {
			System.out.println("우산 챙겨 가세요!!");
		} else {
			System.out.println("우산 놓고 가세요");
		}
		System.out.print("당신의 목표는>>");
		scan.nextLine();//이전에 입력되었던 엔터를 먼저 인식해서 아래 문장에 지장이 없게끔 한다.
		String life = scan.nextLine();//엔터 치기 전의 문장, 
		System.out.println("목표는 : "+ life);

	}// mian

}// class
