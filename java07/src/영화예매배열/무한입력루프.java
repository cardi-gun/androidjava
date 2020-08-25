package 영화예매배열;

import java.util.Scanner;

public class 무한입력루프 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("게임을 계속하실래요? 1)네  2)아니요>>");
			int choice = scan.nextInt();
			if(choice == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		
	}

}
