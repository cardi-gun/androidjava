package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 200;
		int y = 100;
		//더 해봅시다.
		int sum = x + y;// 그냥 x + y;만 하게 되면 의도 없이 한 일에 대해 에러가 난다
		//**자바에서 int끼리의 계산은 무조건 int이다.
		System.out.println("두수의 합은" + sum);
		double div = y / x;
		System.out.println("두수의 나눗셈은" + div);
		//int 끼리의 계산은 소숫점을 날려버리기 때문에 소숫점을 표기할때는 좋지 않다.
		//double <- 8바이트 / int <-4바이트  더블이 더 크기가 크기 때문에 int대신 집어 넣을 수 있다.
		//결과가 0.0로 나오는 이유는 계산후 더블이 적용되기 때문이다.
		
		//**자바에서는 하나라도 double이면 무조건 double이다.
		//하나만 정수를 실수로 강제로 변환하여 계산시 사용한다.
		//강제로 타입을 바꾸는 것 : 타입변환(형 변환)
		double div2 = (double)y / x;
		System.out.println("두수의 진짜 나눗셈은" + div2);
		
		double div3 = (double)(y / x);
		//()우선계산이기 때문에 소괄호 안에있는 int계산후에 더블로 형변환이 된다.
		System.out.println("두수의 나눗셈은" + div3);
		
		

	}

}
