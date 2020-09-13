package 클래스만들기;

public class 계산기2 {
	// 각 부품의 기능을 정의할 때는 메서드를 쓴다.
	// 메서드는 두가지 이다. 무언가를 동작하는 메서드, 무언가를 가져오는 메서드
	// void == 없다.(가져오는값, 반환값이 없다.)
	public void add(int x, int y) {
		// 값을 받아오기위해 int x와y는 잠깐 넣어두는 변수,
		// 메서드의 입력값으로 잠깐 저장할 용도로 선언된 변수
		// 메서드의 사용과 처리 중간다리의 변수 : 매게변수(parameter,파라메터)

		// add메서드안에서만 쓰는 지역변수(local변수)
		// 지역변수는 자동초기화가 되지 않는다.
		int result = x + y;
		System.out.println("합은 " + result);
	}

	public void minus() {
		System.out.println("빼깋");
	}

	// retrun으로 넘길때, void자리에 자료형을 쓴다.
	//retrun를 넘길때 받을 공간이 있어야한다. 
	public int mul(int x, int y) {
		int result = x * y;
		return result;// 30000
	}

	public void div() {
		System.out.println("나누깋");
	}

}
