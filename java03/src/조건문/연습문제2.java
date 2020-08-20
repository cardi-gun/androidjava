package 조건문;

public class 연습문제2 {

	public static void main(String[] args) {
		// 구구단을 짝수단 만 출력하는 문제
		
		for (int i = 1; i < 10; i++) {//구구단 앞자리 단 설정
			
			if(i%2 != 0) {// 짝수가 아닌 단은 배제
				continue;
			}
			for (int j = 1; j < 10; j++) { //구구단 출력
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println(" "); //가독성을 위해 줄바꿈
		}//for
	}//main
}//class
