package 조건문;

import javax.swing.JOptionPane;

public class 연습문제1_2 {

	public static void main(String[] args) {
		// 숫자 2개 연산기호 1개를 받아 연산하는 문제
		String input1 = JOptionPane.showInputDialog("첫번째 수를 입력하세요");
		String input2 = JOptionPane.showInputDialog("두번째 수를 입력하세요");
		String input3 = JOptionPane.showInputDialog("연산 기호를 입력하세요");
		//숫자는 int로 형 변환, 연산기호는 char형으로 변환.  
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		char operator = input3.charAt(0);

		switch (operator) {//부호에 따른 다른 결과값 출력
		case '+':
			System.out.println("결과는 = " + (num1 + num2));
			break;
		case '-':
			System.out.println("결과는 = " + (num1 - num2));
			break;
		case '*':
			System.out.println("결과는 = " + (num1 * num2));
			break;
		case '/':
			System.out.println("결과는 = " + (num1 / num2));
			break;
		case '%':
			System.out.println("결과는 = " + (num1 % num2));
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}//switch
	}// main
}// class
