package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제3. 숫자 1개를 입력받고 문자 1개를 입력 받아서 입력한 숫자 만큼 문자를 프린트

		// 1. 반복할 횟수, 문자를 입력
		String str1 = JOptionPane.showInputDialog("반복할 횟수를 입력하세요.");
		String str2 = JOptionPane.showInputDialog("반복할 문자를 입력하세요.");

		// 2. 횟수만 정수로 처리
		int num1 = Integer.parseInt(str1);

		// 3. 문자를 반복하여 출력
		for (int i = 0; i < num1; i++) {
			System.out.print(str2);

		}
	}

}
