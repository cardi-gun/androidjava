package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		//비교연산자의 결과가 boolean(논리형이다!)
		int x = 200;
		int y = 100;
		System.out.println("동일한가요?" + (x == y));
		System.out.println("불일치한가요?"+(x != y));
		System.out.println("이상인가요?"+(x >= y));
		System.out.println("초과인가요?"+(x > y));
				
	}
}
