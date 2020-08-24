package 배열응용;

import java.util.Random;

public class 마이너스난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(42);
		int[] number = new int[5000];
		for (int i = 0; i < number.length; i++) {
			//number[i] = r.nextInt(1000)+1;/0~999=>1~1000
			//number[i] = r.nextInt(1000)-999;/-999~0
			number[i] = r.nextInt(1999)-999;
			System.out.println(i +"번째 숫자는 :"+ number[i]);
		}
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if(max<number[i]) {
				max = number[i];
			}
		}
		System.out.println(max);
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if(min>number[i]) {
				min = number[i];
			}
		}
		System.out.println(min);
	}

}
