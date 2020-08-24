package 배열응용;

import java.util.Random;

public class 입력배열4 {

	public static void main(String[] args) {
		// 입력을 받아서, 저장공간에 넣어두었다가
		// 나중에 꺼내서 연상이나 출력을 하고자 하는 경우
		Random r = new Random();// 아무거나 만들어주는 클래스
		int[] data = new int[1000];
		for (int i = 0; i < 1000; i++) {
			// 변수 선언의 위치가 변수를 사용할수 있는 범위(지역을 결정한다)
			data[i] = r.nextInt(10000);// nextInt(100) = 0~99까지
		}

		for (int x : data) {
			System.out.println(x);
		}

	}

}
