package 조건문;

import javax.swing.JOptionPane;

public class vote {

	public static void main(String[] args) {
		// 투표시스템
		int pop1 = 0, pop2 = 0, pop3 = 0, count = 0;
		//각 투표수, 전체 투표수 변수 설정
		while (true) {

			String vote = JOptionPane.showInputDialog("1아이유, 2 유재석, 3방탄, 4종료");
			int voted = Integer.parseInt(vote);

			if (voted == 4) {//종료확인
				System.out.println("투표를 종료합니다.");
				break;
			}

			count++;//전체 투표수 증가
			if (voted == 1) {//비교 투표 확인
				System.out.println("아이유에게 투표합니다.");
				pop1++;//투표수 증가
			} else if (voted == 2) {
				System.out.println("유재석에게 투표합니다.");
				pop2++;
			} else if (voted == 3) {
				System.out.println("방탄소년단에게 투표합니다.");
				pop3++;
			} else {
				System.out.println("다시 투표하세요!");
			}
		} // whlie
		System.out.println("총 투표수: " + count);
		System.out.println("아이유: " + pop1);
		System.out.println("유재석: " + pop2);
		System.out.println("방탄: " + pop3);
	}//main
}//class
