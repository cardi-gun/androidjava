package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1. 2개의 숫자를 입력받아서 사칙연산을 해보시오.

		// 1.데이터입력 - 두개의 숫자를 사용자로부터 입력 받아오는 과정(String)
		String str1 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요.");
		String str2 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요.");

		// 2.처리 - 두개의 문자열을 숫자(정수)로 처리하는 과정
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		// 3.출력 - 사칙연산을 하여 출력
		System.out.println("더한 값은" + (num1 + num2));
		System.out.println("뺀 값은" + (num1 - num2));
		System.out.println("곱한 값은" + (num1 * num2));
		System.out.println("나눈 값은" + (num1 / num2));
		System.out.println("나머지 값은" + (num1 % num2));

	}

}
