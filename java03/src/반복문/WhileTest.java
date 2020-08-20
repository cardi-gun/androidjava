package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		//계속 반복하고자 하는 경우 = true일 때 무한반복
		while (true) {
			System.out.println("내가 계속 돌아요");
			String choice= JOptionPane.showInputDialog("계속하시겠습니까? Y/N");
			if (choice.equals("n")||choice.equals("no")) {//대문자의 경우 다 대문자로  입력받도록 변환해서 비교하면 편안
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); //프로그램 종료.
				//break;자신을 포함하고 있는 '반복문'을 끝냄
				//while문을 종료, while아래에 있는 것들은 계속 실행.
			}
		}
		//System.out.println("내가 실행 될까요? :)");
		
		//제한된 횟수를 반복하고자하는 경우 시작값과 조건식 증감값을 정해준다.
//		int i = 0;//시작값
//		while(i<10) {//조건식
//			System.out.println("내가 열번 돌아요");//실행내용
//			i++;//증감값
//		}
		
	}

}
