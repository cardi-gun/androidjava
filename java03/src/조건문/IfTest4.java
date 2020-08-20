package 조건문;

import javax.swing.JOptionPane;

public class IfTest4 {

	public static void main(String[] args) {
		
		//카운트할 변수 선언
		int ok = 0, no = 0, etc = 0;
		
		while (true) {//무한루프
			
			System.out.println("반복할까요?");
			String input = JOptionPane.showInputDialog("ok/no/etc/exit");
			
			if(input.equals("exit")) {
				break;//무한루프시  '우선적으로' 반복할건지 중단할건지를 확인하는 과정이 앞에 필요하다.
			}
			if (input.equals("ok")) {//ok입력시 카운트
				ok++;
			} else if (input.equals("no")) {//no입력시 카운트
				no++;
//			} else if (input.equals("exit")) {
//				break;//반복문 중단
//				//System.exit(0);
			} else {//기타 나머지
				etc++;
			}
		}
		//긍정, 부정, 기타 횟수 확인.
		System.out.println("긍정 횟수는 " + ok + "회");
		System.out.println("부정 횟수는 " + no + "회");
		System.out.println("기타 횟수는 " + etc + "회");
		
	}

}
