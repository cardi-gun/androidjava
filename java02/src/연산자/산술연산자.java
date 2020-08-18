package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자
		int x = 200;
		int y = 100;
		System.out.println("더한 값은 " + (x + y));
		//자바는 위에서 아래로, 왼쪽에서 오른쪽으로 실행된다.
		//String 형과 x가 결합하며 String으로 처리가 되며 
		//결과 값이 더한 값은 200100 이 된다.
		System.out.println("뺀 값은 " + (x - y));
		System.out.println("곱한 값은 " + (x * y));
		//결합연산자 보다 산술연산자중 * / %이 우선순위이기 때문에 먼저 계산된다.
		//소괄호를 치지 않아도 연산이 가능하지만 좋은 코드는 아니다.
		System.out.println("나눈 값은 " + (x / y));
		System.out.println("나머지 값은 " + (x % y));
	}

}
