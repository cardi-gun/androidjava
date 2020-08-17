package operator;

import javax.swing.JOptionPane;

public class basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요.");
		String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요.");
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		int sum = num3 + num4;
		System.out.println("두 수를 합한 값은 " + sum);
	}

}
