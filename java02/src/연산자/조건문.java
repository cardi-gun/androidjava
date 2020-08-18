package 연산자;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건이 여러개 일때, if~else if~....else
		// if, if, if, if 의 비교

		int score = 88;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

//		int score = 88;
//		if	(score >= 90) {
//			System.out.println("A");
//		}
//		if	(score >= 80) {
//			System.out.println("B");
//		}
//		if	(score >= 70) {
//			System.out.println("C");
//		} //결과가 B C가 출력이 된다.
	}

}
