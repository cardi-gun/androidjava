package 조건문;

import javax.swing.JOptionPane;

public class note {

	public static void main(String[] args) {
		// 스티커 노트 판매 시스템
		
		//제품 개수, 금액 설정
		String stik1 = JOptionPane.showInputDialog("필요한 스티커 개수?");
		String stik2 = JOptionPane.showInputDialog("스티커의 가격?");		
		String note1 = JOptionPane.showInputDialog("필요한 노트 개수?");
		String note2 = JOptionPane.showInputDialog("노트의 가격?");
		//형변환
		int stik3 = Integer.parseInt(stik1);
		int note3 = Integer.parseInt(note1);	
		int stik4 = Integer.parseInt(stik2);
		int note4 = Integer.parseInt(note2);
		//합계 연산
		int sumstik = stik3 * stik4;
		int sumnote = note3 * note4;
		//총 합계 연산
		int sumall = sumstik + sumnote;
		//출력
		System.out.println("스티커 개수 : " + stik3);
		System.out.println("스티커 가격 : " + stik4);
		System.out.println("노트 개수 : " + note3);
		System.out.println("노트 가격 : " + note4);
		System.out.println("스티커 총 가격 : " + sumstik);
		System.out.println("노트 총 가격 : " + sumnote);
		//25000원 이상이면 할인
		if (sumall > 25000) {
			System.out.println("원래 결제 금액 " + sumall + "원 입니다.");			
			System.out.println("총 결제 금액 " + (sumall - 3000) + "원 입니다. (3000할인)");
		} else {
			System.out.println("총 결제 금액 " + sumall + "원 입니다.");
		}//if
	}//main
}//class
