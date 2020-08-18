package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제2. 숫자를 2개(시작값, 종료값) 입력 받아서 시작 값이 5, 종료 값이 1000이면
		// 5에서 1000까지 프린트

		// 1. 숫자 입력
		String str1 = JOptionPane.showInputDialog("시작값을 입력하세요");
		String str2 = JOptionPane.showInputDialog("종료값을 입력하세요");

		// 2. 처리, 두 수를 비교하여 작은 숫자부터 큰 숫자까지 1씩증가하여 출력
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		// 3. 출력
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}

		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}

		}
	}

}
