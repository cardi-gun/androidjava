package 조건문;

import javax.swing.JOptionPane;

public class IfTest3 {

	public static void main(String[] args) {

		int target = 88;
		int lose = 0;// 틀린 횟수
		int count = 0;// 전체 횟수
		while (true) {// 무한루프

			String input = JOptionPane.showInputDialog("타겟을 맞춰보세요");
			// 입력값을 정수형으로 형변환
			int input1 = Integer.parseInt(input);
			count++;
			if (target == input1) {// 타겟값과 입력값 비교
				System.out.println("맞췄습니다! 축하합니다.");
				break;
			} else {//공통으로 처리할수 있는 부분은 공통으로  처리한다.
				lose++;
				System.out.print("틀렸습니다.");
				// 큰지 작은지 힌트를 주기위해 대소비교
				if (target > input1) {// 입력값이 작을때
					System.out.println("너무 작아요! 다시!");
				} else {// 입력값이 클때
					System.out.println("너무 커요! 다시!");
				}
			}
		} // while
		System.out.println("총 시도 횟수는" + count);
		System.out.println("총 " + lose + "회 틀렸습니다.");
	}// main
}// class
