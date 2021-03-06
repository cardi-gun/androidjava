package 이차원배열;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 영화예매이차원2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] seat = new int[3][10];// 2차원 배열로 변경
		String[] rows = { "A", "B", "c" };// 행 지정 변수
		int count = 0;// 예매 상황 확인 변수

		while (true) {
			System.out.println("------------------------------");
			System.out.print("   ");
			for (int i = 0; i < 10; i++) {
				System.out.print((i + 1) + "  ");// 보이는 부분을 1~10까지
			}
			System.out.println("");
			System.out.println("-------------------------------");
			for (int i = 0; i < seat.length; i++) {// seat.length는 안에 3이 들어있음
				System.out.print(rows[i] + "  ");
				for (int j = 0; j < seat[i].length; j++) {// seat[i].length는 안에 10이 들어있음
					System.out.print(seat[i][j] + "  ");// 이차원 배열 i행,j열안의 내용값 출력
				}
				System.out.println(" ");
			}
			System.out.println("-------------------------------");
			System.out.println("원하시는 좌석을 입력하세요(ex)a9)>>");
			
			String input = scan.nextLine();
			//좌석을 a9 b3 과 같이 입력받음
			String row = input.substring(0,1);//입력받은 좌석의 앞문자,추출
			String incol = input.substring(1);//입력받은 좌석의 뒷문자 추출
			
			String rowcheck = "^[a-zA-Z]*$";//앞에 받은 문자가 영문자인지 확인
			boolean rowresult = Pattern.matches(rowcheck, row);
			String colcheck = "^[0-9]*$";
			boolean colresult = Pattern.matches(colcheck, incol);
			
			if(rowresult == false || colresult== false) {
				System.out.println("잘못된 입력으로 종료합니다.");
				break;
			}
			
			int col = Integer.parseInt(incol);
			
			// 대소문자 포함해서 열 지정
			if (row.equals("a") || row.equals("A")) {
				if (seat[0][col - 1] == 0) {// 지정한값에 내용물이 예매가 되었는지 확인하기한 if문
					seat[0][(col - 1)] = 1;// 원하는 값에 지정해주기 위해 -1을 설정
					// ex 2 선택 = col[2] 이기 때문에 3번째 방에 오게되는데
					// col[2-1]=col[1]로 만들어준다.
					System.out.println("예매가 되었습니다.");
					count++;// 예매가 될때 마다 count의 값 증가.
				} else {
					System.out.println("이미 예매가 된 자리입니다. 다른 좌석을 선택해주세요");
				}
			}
			if (row.equals("b") || row.equals("B")) {
				if (seat[1][col - 1] == 0) {
					seat[1][(col - 1)] = 1;// 원하는 값에 지정해주기 위해 -1을 설정
					System.out.println("예매가 되었습니다.");
					count++;// 예매가 될때 마다 count의 값 증가.

				} else {
					System.out.println("이미 예매가 된 자리입니다. 다른 좌석을 선택해주세요");
				}
			}
			if (row.equals("c") || row.equals("C")) {
				if (seat[2][col - 1] == 0) {
					seat[2][(col - 1)] = 1;// 원하는 값에 지정해주기 위해 -1을 설정
					System.out.println("예매가 되었습니다.");
					count++;// 예매가 될때 마다 count의 값 증가.

				} else {
					System.out.println("이미 예매가 된 자리입니다. 다른 좌석을 선택해주세요");
				}
			}
		} // while

		System.out.println("총 예매된 자리는 " + count + "석 입니다.");// 예매 횟수값 출력
		System.out.println("총 금액은 " + (count * 10000) + "원 입니다.");// 예매 횟수값으로 금액 출력

	}// main

}// class
