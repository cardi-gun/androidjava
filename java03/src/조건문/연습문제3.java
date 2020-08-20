package 조건문;

public class 연습문제3 {

	public static void main(String[] args) {
		// 별 출력하기
		
		int start = 5;
		for (int i = 1; i < 10; i++) {//행 반복
			if(i<6) {
				for (int j = 0; j < i; j++) {//별 증가
					System.out.print("*");
				}
			}else {
				start--; //별 감소
				for (int k = start; k > 0; k--) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}//for
	}//main
}//class
