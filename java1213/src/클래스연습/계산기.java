package 클래스연습;

public class 계산기 {
//	계산기 => class
//	프로그램하려고 하는 대상의 2가지의 특징
//	1) 눈에 보이는 속성 ex) 색, 크기, 가격 (명사형) 
//		=> 멤버변수(=전역변수, global변수, 클래스 전체영역에서 사용가능)
//		=> 자동초기화(0, null...)
	String color;// 참조형(null)
	int price;// 기본형(0)
	int size;// 기본형(0)
//	2) 동작 ex) 더하다, 빼다, 곱하다 (동사형)
//	=> 멤버메서드 (입력값, 반환값(둘다 있을수도 없을수도있음))

	
//	메서드(기능) 정의
	public int 더하다(int x, int y) {
		//void: 없다. 반환값이 없다.
		int result = x + y;
		return result;
	}

	public int 빼다(int x, int y) {
		int result = x - y;
		return result;
	}

	public int 곱하다(int x, int y) {
		int result = x * y;
		return result;
	}

	public void 나누다() {

	}
}
