package 조건문;

import javax.swing.JOptionPane;

public class ifTest2 {

	public static void main(String[] args) {

		int ok = 0, no = 0, etc = 0;
		// 누적시키는 변수는 반복문 안에 넣으면 안된다.
		// 반복 할 때 마다 누적되지 않고, 초기화 되기 때문에.!

		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("긍정은 OK/부정은 NO/나머지는 기타");
			if (data.equals("ok")) {
				System.out.println("긍정");
				// ok = ok + 1;
				ok++;// 1씩 증가 증감연산자.
			} else if (data.equals("no")) {
				System.out.println("부정");
				no++;
			} else {
				System.out.println("뭐라는 거야");
				etc++;
			}
		}
		System.out.println("긍정횟수는 " + ok + "회");
		System.out.println("부정횟수는 " + no + "회");
		System.out.println("기타횟수는 " + etc + "회");

	}

}
