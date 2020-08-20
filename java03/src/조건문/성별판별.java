package 조건문;

import javax.swing.JOptionPane;

public class 성별판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = JOptionPane.showInputDialog("주민등록번호를 입력하세요");
		//String ssn = "930429-1456123";// 6자리-7자리 총 14자리 문자열
		//프로그램 언어로 문자를 char로 받을수 있는 방법은 없다.
		//String으로 입력을 받아서, 원하는 char만 추출한다.
		char gender = ssn.charAt(7);
		//String sub = ssn.substring(7,8);//7부터 8의 앞까지, 7만 가져온다.
		//String에 한글자 추출하는  함수, 위치를 가지고 특정한 문자 한개를 추출하면 된다.
		//위치는 index라고 부르며 인덱스는 0부터 시작한다.
		switch (gender) {
		case '1': case '3' : //char는 ''로 표기한다
			System.out.println("남자입니다.");
			break;
		case '2': case '4' :
			System.out.println("여자입니다.");
			break;		
		default:			
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
	}

}
