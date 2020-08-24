package 배열기본;

public class 배열개념 {

	public static void main(String[] args) {
		// 배열은 많은 양의 데이터를 한꺼번에 다룰때 편리하다
		// 배열 선언
		int[] jumsu = new int[1000];// int+int+int+int....+int
		// char gender[] = new char[500];// char+char+char...+char
		// 자료형[] 변수명 = new 자료형[갯수];
		// int변수 1000개가 모두 이름이 jumsu이며 jumsu의 인덱스로 구분한다.
		// 첫번째 jumsu는 index는 0!=>jumsu[0]
		// 두번째 jumsu의 index는 1!=>jumsu[0]
		// 마지막 jumsu의 index는 전체갯수-1!=>jumsu[999]
		System.out.println(jumsu); // 주소가 들어간다.
		// 기본형변수 : 기본형데이터만 저장된변수
		// =>기본형 변수는 변수 안에 해당 타입의 '값'이 저장
		// 참조(참고)형변수 : 기본형데이터 이외가 저장되는변수
		// =>변수의 '주소'가 저장된다.
		jumsu[0] = 100;
		jumsu[10] = 200;
		jumsu[999] = 1000;
		// jumsu[1000]은 존재 하지 않음
		System.out.println("첫번째 값:" + jumsu[0]);
		System.out.println("11번째 값:" + jumsu[10]);
		System.out.println("마지막 값:" + jumsu[999]);
		System.out.println("500번째 값:" + jumsu[499]);
		for (int i = 0; i < jumsu.length; i++) {
			// 이클립스에서는 for문 바로위의 배열을 기준으로 자동생성해준다, 배열과 반복문은 짝
			System.out.println(i + ": " + jumsu[i]);
		}
		// 배열은 선언하면 자동 초기화가 된다, 기본형 변수는 선언하면 쓰레기값이 들어있었지만.
		String names[] = new String[1000];
		// 문자열 배열은 null로 자동 초기화 된다.
		System.out.println("첫번째 값:" + names[0]);
		System.out.println(names.length);
		// 배열의 갯수를 확인해주는, 배열선언시 생성되는 배열(메모리하나 할당)
		System.out.println("마지막 값:" + names[names.length - 1]);

	}

}
