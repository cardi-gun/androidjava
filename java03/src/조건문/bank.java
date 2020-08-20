package 조건문;

import javax.swing.JOptionPane;

public class bank {

	public static void main(String[] args) {

		int money = 0; //계좌 잔고
		while (true) {

			String button = JOptionPane.showInputDialog("1)입금 2)출금 3)잔고 4)종료");
			int btn = Integer.parseInt(button);
			
			if(btn == 4){ //시스템 종료
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
			if (btn == 1) {
				String save = JOptionPane.showInputDialog("금액을 입력하세요");//금액입력
				int inMoney = Integer.parseInt(save);// 정수로 형변환
				money = money + inMoney;//계좌에 입금 +
				System.out.println("입금액은 "+inMoney+"원 입니다.");

			} else if (btn == 2) {
				String out = JOptionPane.showInputDialog("금액을 입력하세요"); //금액입력
				int outMoney = Integer.parseInt(out);//정수로 형변환
				money = money - outMoney;//계좌에 출금 -
				System.out.println("출금액은 "+outMoney+"원 입니다.");

			} else if (btn == 3) { //계좌 현황 출력
				System.out.println("잔고는 " + money + "원 입니다.");
				
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}

	}

}
