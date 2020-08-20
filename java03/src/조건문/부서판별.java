package 조건문;

import javax.swing.JOptionPane;

public class 부서판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사원번호입력
		String sanum = JOptionPane.showInputDialog("사원번호를 입력하세요");
		
		char part = sanum.charAt(0);//index[0]을 가져온다.
		//String num = sanum.substring(1,4);//index[1]부터 index[4]의 앞 까지
		String num = sanum.substring(1);//index[1]부터 끝까지
		
		System.out.print("사원부서는 ");
		switch (part) {
		case 'A':
			System.out.println("기획부 입니다.");
			break;
		case 'B':
			System.out.println("총무부 입니다.");
			break;
		case 'C':
			System.out.println("개발부 입니다.");
			break;
		default:
			System.out.println("해당부서는 없습니다.");
			break;
		}
		System.out.println("사원 고유 번호는 "+num+"입니다.");
	}

}
