package 조건문;

public class 연습문제3_1 {

	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은경우 까지만 출력
		
		for (int i = 1; i < 10; i++) {//구구단 앞자리 단 증가 반복
			
			for (int j = 1; j < 10; j++) { //구구단 곱하는 수 증가반복
				
				if(i < j) { // 앞자리 단보다 곱하는 수가 클때 break 
					break;
				}
							// 곱하는 수가 작거나 같을때는 출력
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println(" "); //가독성을 위해 줄바꿈
		}//for

	}

}
