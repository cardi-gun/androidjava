package 배열응용;

import java.util.Random;

public class 큰값찾기50 {

	public static void main(String[] args) {
		// 0~99사이 의 값 1000개중 50보다 큰 값 찾기
		Random r = new Random();// 정규분포값
		int[] num = new int[1000];
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
		} // for
		for (int i = 0; i < num.length; i++) {

			if (num[i] >= 50) {
				System.out.println(i + ": " + num[i]);
				count++;
			} // if
		} // for

		System.out.println("50이 넘는 수의 갯수는 : " + count);

	}// main

}// class
