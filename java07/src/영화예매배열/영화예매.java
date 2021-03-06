package 영화예매배열;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 좌석마다 예매상황을 저장할 배열 생성
		int[] seat = new int[10];
		// 계속 반복
		while (true) {
			System.out.println("-------------------------------");
			for (int i = 0; i < seat.length; i++) {// 좌석 출력, 1~10까지
				System.out.print((i + 1) + "  ");
			}
			System.out.println("");
			System.out.println("-------------------------------");
			for (int i = 0; i < seat.length; i++) {// 배열 값 출력
				System.out.print(seat[i] + "  ");
			}
			System.out.println("");
			System.out.println("-------------------------------");

			System.out.println("0~9까지 원하는 좌석을 입력하세요(종료=-1)>>");

			int choice = scan.nextInt();// 숫자입력
			if (choice == -1) {// -1 입력시 프로그램 종료,break문으로 빠져나옴
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (seat[(choice)] == 0) {// seat의 값이 0이면 해당 값을 1로 변경, 좌석예약 알림
				seat[(choice - 1)] = 1;
				System.out.println(choice + "번 좌석에 예약을 완료 했습니다.");
			} else {// seat의 값이 0이 아닐경우 예약 되었음을 알림.
				System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
			}

			// 선택한 번호의 좌석을 예약처리

			System.out.println("");
		} // while

		int sum = 0;
		// 배열 choice의 전체 값 합계, 합산후 출력
		for (int x : seat) {
			sum = sum + x;
		}

		System.out.println(sum + "개의 좌석이 예매 되었습니다.");
		System.out.println("결제금액은 " + (sum * 10000) + "원 입니다.");

		// 1)이미 예약된 자리는 선택불가, 다른자리 선택권유 멘트 후 반복.
		// 2)종료시 몇개의 좌석이 예매가 되었는지, 1자리당 10,000원으로 결제금액 나오기
		// 3)좌석 0부터 9 아닌 1에서 10까지 변경.

	}

}
