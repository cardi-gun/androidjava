package 클래스연습;

public class shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계산기 cal = new 계산기();
		cal.color = "빨강";
		cal.price = 5000;
		cal.size = 11;
		int jucount = 5;
		int cocount = 3;
		int sum = cal.더하다(jucount, cocount);
		int sum2 = sum * 3000;
		System.out.println("합계는 " + sum2 + "원 입니다.");
		// 주소를 가지고 메서드를 쓸 수 있음.

		int juprice = cal.곱하다(jucount, 3000);
		int coprice = cal.곱하다(cocount, 2000);
		System.out.println("쥬스 가격은 " + juprice + "원 입니다.");
		System.out.println("커피 가격은 " + coprice + "원 입니다.");

		int 차이 = cal.빼다(juprice, coprice);
		System.out.println("두 음료간 차이는 " + 차이 + "원 입니다.");

	}

}
