package bean;

public class Main {
	public static void main(String[] args) {
		int[] num = {1,2,3};
		//original for문
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		//for-each문, 위와 똑같은 문법
		for (int x : num) {
			System.out.println(x);
		}
	}
}
