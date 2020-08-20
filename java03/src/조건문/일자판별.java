package 조건문;

public class 일자판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 8;
		switch (month) {
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("이 달은 30일까지 있습니다.");
			break;

		case 2:
			System.out.println("이 달은 28일까지 있습니다.");
			break;

		default://나머지를 디폴트로 주는게 편하다.
			System.out.println("이 달은 31일까지 있습니다.");
			break;
		}
	}

}
