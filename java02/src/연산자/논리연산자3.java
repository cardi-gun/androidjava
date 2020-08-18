package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "root";
		String pw = "pass";
		
		String logid = JOptionPane.showInputDialog("아이디입력");
		String logpw = JOptionPane.showInputDialog("비밀번호입력");
//		String logpw = "no";//String은 부품(class)
		
		if(id.equals(logid) && pw.equals(logpw)) {//쓸수있는 기능이 있는 부품은 뒤에 . 으로 확인할수 있다
			//String.equals(변수): string 과 변수가 같은지 확인하는 기능
			//and연산자, 여러 조건이 '모두' true일때, 전체 논리적인 판단을 true라고 한다.
			//비교하고싶은 조건이 두개이상일때 사용하는 연산자, 논리연산자
			System.out.println("로그인");
		}else {
			System.out.println("비로그인");
		}
		
		
	}

}
