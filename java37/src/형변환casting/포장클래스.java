package 형변환casting;

public class 포장클래스 {

	public static void main(String[] args) {
		//포장클래스 (wrapper class, 래퍼클래스)
		//기본형에 대한 추가적인 기능을 붙여서
		//클래스로 만들어 놓은 것.
		//int -> Integer
		//double -> Double
		//char -> Character
		//boolean -> Boolean
		
		int x = 100; //기본형
		Integer y = new Integer(200); //래퍼클래스로 생성
		x = y ; //기본형과 해당포장클래스 간에는 자동으로 변환이 된다.
		//참조형 -> 기본형 : 오토 언박싱(Auto unboxing);
		y = x;//기본형데이터를 객체화 해서 참조형에 넣는다
		//기본형 -> 참조형 : 오토 박싱(Auto boxing);
		
	}

}
