package 클래스만들기;

public class 계산기3 {

	//자바에서는 메서드 이름을 동일하게 쓸 수 있으며, 입력값이 다 달라야 한다.
	//동일한 이름을 가지 메서드의 구분은 
	//호출시 입력값의 타입, 순서, 개수로 한다. 셋이 다 맞아야 한다. 
	public void add() {
		System.out.println("더하깋");
	}
	public void add(int x) {
		System.out.println(x+100);
	}
	public void add(int x, int y) {
		System.out.println(x+y);
		
	}
	public void add(double x , int y) {
		System.out.println(x+y);

	}
	public void add(int x , double y) {
		System.out.println(x+y);

	}
}
