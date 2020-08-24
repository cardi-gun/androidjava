package 배열응용;

import java.util.Random;

public class 입력배열5 {

	public static void main(String[] args) {
		// 임의의 값 100개 만들어서 배열에 넣고 전체를 출력, 첫번째값 마지막값 더해서 출력
		// 임의의 값 생성
		Random r = new Random();
		// 배열 100개 생성
		int[] random = new int[100];
		// 임의의 값 100개 생성
		for (int i = 0; i < random.length; i++) {
			random[i] = r.nextInt(1000);
		}
		// 배열 출력
		for (int i : random) {
			System.out.println(i);
		}
		// 첫번째, 마지막 값 합산 출력
		System.out.println((random[0] + random[99]));
	}

}
