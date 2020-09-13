package 배열정리;

public class 변수복사 {

	public static void main(String[] args) {

//		기본형변수 (정수 실수 문자 논리)
		int x = 300; // -21억~21억
		int y = x;
		// 기본형 변수는 값을 그대로 복사 해온다. 변수 y에도 300이 저장.
		System.out.println("x :" + x);
		System.out.println("y :" + y);
		System.out.println("----------");
		x = 500;
		System.out.println("x :" + x);
		System.out.println("y :" + y);
		// x의 값이 바뀌어도 y는 이전에 이미 값을 복사해왔기 때문에 x가 변경되어도 지장이 없다.
		System.out.println("--------------------");

//		참조형변수 (주소 복사)
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a; // 주소를 그대로 복사
		System.out.print("a :");
		for (int i : a) {// 배열출력
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.print("b :");
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("----------");

		a[0] = 9;
		a[1] = 8;
		// a의 요소를 바꾸고 출력
		System.out.print("a :");
		for (int i : a) {// 배열출력
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.print("b :");
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println(a);
		System.out.println(b);
		// b는 a의 주소를 따온것이기 때문에 a안의 내용이 바뀌어도 주소가 같아 a와 항상 같은 값을 가져온다.(얕은 복사)
		System.out.println("--------------------");

//		참조형변수(깊은복사)
		int[] c = { 3, 4, 5, 6, 7 };
		int[] d = c.clone(); // 주소가 가르키는 값의 리스트를 복사 (깊은 복사)
		// 배열인 참조형 변수는 깊은 복사를 해야한다.
		System.out.print("c :");
		for (int i : c) {// 배열출력
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.print("d :");
		for (int i : d) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("----------");

		c[0] = 8;
		c[1] = 7;
		// c의 요소를 바꾸고 출력
		System.out.print("c :");
		for (int i : c) {// 배열출력
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.print("d :");
		for (int i : d) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println(c);
		System.out.println(d);
		// 깊은 복사를 하여 값이 들어있는 리스트를 복사한뒤 주소는 따로 생성이 되기 때문에 주소가 다르다.(깊은복사)
		System.out.println("----------");

	}

}
