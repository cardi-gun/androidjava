package 클래스만들기;

public class 컴퓨터 {
	// 상태정의("멤버변수"): "전역변수"(="global변수")
	// 객체 생성 후 멤버변수는 객체마다 다 별도로 복사된다.
	// 복사된 멤버변숭에는 생성된 객체의 실제 값이 들어간다.
	// 멤버변수는 실제 값이 들어가는 변수("인스턴스 변수")
	// 전역변수는 클래스 전체 영역에서 사용가능하다.
	// 변수는 선언의 위치가 중요하다, 선언의 위치가 이 변수를 쓸 수 있는범위를 결정
	public int price; // 가격
	public String company; // 제조회사
	public int size;//모니터의 크기 
	//public이 없으면 같은패키지에서만 사용이 가능하다.(접근제어자)
	//외부패키지에서 사용하기 위해서 public을 붙여줘야한다.
	
	// 동작정의(멤버메서드):
	public void internet() {
		System.out.println("인터넷 하다.");
	}
	public void doc() {
		System.out.println("문서작성하다.");
	}
	
	//원래 toString()은 기본형이면 기본형 값, 참조형이면 주소를 찍어주는 클래스
	//toString()를 내가 원하는 프린트 모양대로 변경해서 사용할 수 있다.
	//eclipse의Source에 가서 toString()메서드 코드 자동 생성.
	@Override
	public String toString() {
		return "price=" + price + ", company=" + company + ", size=" + size;
	}
	
	
	
}
