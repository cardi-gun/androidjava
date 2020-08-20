package 조건문;

public class 계절판별2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 8;
		switch (month) {//정수(byte,short,int)O
						//실수는 x
						//문자, 문자열(String)O
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;

		default:
			System.out.println("겨울입니다.");
			break;
		}
	}

}
