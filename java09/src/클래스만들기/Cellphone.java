package 클래스만들기;

public class Cellphone {
//	휴대폰 class(부품)
//	--------------
//	속성(특성): 색, 크기, 제조사 =>(멤버)변수 정의 (우선정의)
	String color;
	int size;
	String company;
	// 틀 역할이기 때문에 초기화 하지 않는다. 찍어낼때 초기화.

//	기능(동작): 전화, 문자, 검색 =>(멤버)메서드 정의	
	public void call() {
		System.out.println("전화하다.");
	}

	public void messege() {
		System.out.println("문자하다.");

	}

	public void search() {
		System.out.println("검색하다.");
	}

}
