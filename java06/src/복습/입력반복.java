package 복습;

import javax.swing.JOptionPane;

public class 입력반복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] jumsu = new int[5];
		// int count = 0;
		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("점수 입력");
			jumsu[i] = Integer.parseInt(data);
			// count = count + jumsu[i];
		}

		int sum = 0;
		// 10 , 20, 30, 40, 50
		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
			// 10 = 0 + 10 / i = 0
			// 30 = 10 + 20 / i = 1
			// 60 = 30 + 30 / i = 2
			// 100 = 60 + 40 / i = 3
			// 150 = 100 + 50 / i = 4
		}

		System.out.println(sum);
	}

}
