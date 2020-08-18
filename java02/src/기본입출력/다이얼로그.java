package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서의 코딩 방식 
		//특정한 일을 처리하는 부품을 만들어 전담시킨다.
		//jdk내장, 인터넷 다운, 직접 만들기
		//자바에서 자주 사용되는 부품은 미리 메모리에 가져다 놓고 있음. 
		//이러한 부품의 이름을 대문자로 시작해서 사용한다
		String hour = JOptionPane.showInputDialog("지금 몇시인가요?");
		//				클래스 이름. 함수 이름
		//기능을 처리해주는 단위: function(함수)
		JOptionPane.showMessageDialog(null, hour+ "시 입니다.");
		//empty == null
		//메세지 출력창 JOptionPane.showMessageDialog(알림창이 뜰 위치, 내용);
		
		//int<- String (기본형이 아니기 때문에 기본형으로 바꿀수 있는 부품을 사용해야한다.)
		int hour1 = Integer.parseInt(hour);
		
		if (hour1 < 16) {//조건에는 비교연산자를 쓰고, 비교연산자의 결과는 논리값이다.
			//true
			JOptionPane.showMessageDialog(null, "아직 집에 갈 시간이 멀었군요");
		} else {
			//false
			JOptionPane.showMessageDialog(null, "집에 갈 시간이 얼마 안남았군요");

		}
		
		
		
		
		
		
	}

}
