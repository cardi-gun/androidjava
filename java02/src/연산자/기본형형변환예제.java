package 연산자;

public class 기본형형변환예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 100;
		int y = x;
		System.out.println(y);
		// 자동형변환

		int a = 300;
		// byte b = a;
		// System.out.println(b);
		// 강제로 형변환을 해도 이미 a의 값이 byte의 값을 초과하기 때문에 사용할 수 없다.
		
		double c = 400; //8바이트
		int d = (int) c;
		System.out.println(d);
		// int로 강제 형변환이 가능

		int e = 400;
		double f = e;
		System.out.println(f);
		// 자동형변환

	}

}
