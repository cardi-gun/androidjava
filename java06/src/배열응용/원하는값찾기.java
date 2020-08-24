package 배열응용;

import java.util.Random;

public class 원하는값찾기 {

	public static void main(String[] args) {
		// 랜덤 생성
		// Random r = new Random();
		Random r = new Random(42);// 씨앗값, 일정한 결과가 반복되게 한다
		int[] number = new int[1000];

		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(1000);// 0~999 까지의 범위
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + " : " + number[i]);
		}
 
		int target = 100;
		int count = 0; // 몇 번 나왔는지
		for (int i = 0; i < number.length; i++) {
			if (number[i] == target) {
				System.out.println("타겟 " + target + "의 위치는 " + i);
				count++;// 증감연산자
			}
		}
		// 최대값찾기
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		// 동일한 최대값의 개수
		int countmax = 0;
		for (int i = 0; i < number.length; i++) {
			if (max == number[i]) {
				countmax++;
			}
		}
		// 최소값 찾기
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if (min > number[i]) {
				min = number[i];
			}
		}
		// 동일한 최소값의 개수
		int countmin = 0;
		for (int i = 0; i < number.length; i++) {
			if (min == number[i]) {
				countmin++;
			}
		}
		
		/* 처음에 생각한 비교, if 문에서 보다 큰수를 '매번' 저장하기 때문에 
		 * 기존에 값을 배제 하고 테스트의 값은 둘중 큰것만 저장하게 되어 비교대상 둘중의 큰 값만
		 * 나오게 되는 현상. 
		int test = 0;
		for (int i = 0; i < number.length-1; i++) {
			if(number[i] < number[i+1]) {
				test = number[i+1];
			}
		}
		System.out.println("test : " + test);
		 */
		
		System.out.println(target + "의 갯수는 " + count);

		// 최대값의 위치 구하기
		for (int i = 0; i < number.length; i++) {
			if (max == number[i]) {
				System.out.println("최대값 " + max + "의 위치는 " + i);
			}
		}

		System.out.println("최대값은 : " + max);
		System.out.println("동일한 최대값의 갯수 : " + countmax);
		System.out.println("최소값은 : " + min);
		System.out.println("동일한 최소값의 갯수 : " + countmin);

	}
}
