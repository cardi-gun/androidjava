package 조건문;

public class 연습문제4 {

	public static void main(String[] args) {
		// 반복문을 이용하여 고깔모양의 별을 출력하기
		
		
		for (int i = 1; i < 5; i++) {
			
			for (int j = (5-i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((i*2)-1); j++) {
				//비교값을 늘린다. 2개씩 증가하지만 출력은 홀수이기때문에
				//비교값에 곱하기2 -1을 하여 늘리면서 홀수로 맞추고
				//그 늘어난만큼 반복횟수가 늘어 별을 더 출력한다.
				System.out.print("*");
			}
			for (int j = (5-i); j > 0; j--) {
				System.out.print(" ");

			}
			System.out.println(" ");
			
		}
	}

}
