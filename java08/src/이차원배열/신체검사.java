package 이차원배열;

import java.util.Scanner;

public class 신체검사 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("오늘의 징병대상자 수는");
		int people = scan.nextInt();

		String[][] resinum = new String[people][2];
		double[][] body = new double[people][3];

		int year = 2020;
		for (int i = 0; i < people; i++) {
			System.out.print("주민등록 번호를 입력하세요>>");
			String input = scan.next();
			resinum[i][0] = input.substring(7, 8);
			resinum[i][1] = input.substring(0, 4);
			int age = Integer.parseInt(resinum[i][1]);
			if (!(resinum[i][0].equals("1") || year - age < 18)) {
				System.out.println("징병대상자가 아닙니다.");
			} else {
				System.out.print("키를 입력하세요>>");
				body[i][0] = scan.nextInt();
				System.out.print("몸무게를 입력하세요>>");
				body[i][1] = scan.nextInt();
				System.out.print("시력을 입력하세요>>");
				body[i][2] = scan.nextInt();
			}
			
		}//for
		
	}//main

}//class
