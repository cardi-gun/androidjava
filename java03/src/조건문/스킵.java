package 조건문;

public class 스킵 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				continue;//스킵, 3의 배수만 처리 하고싶지 않을때 사용한다.
			}
			System.out.println(i);
		}
	}
}
