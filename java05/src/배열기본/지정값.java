package 배열기본;

public class 지정값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장공간이 만들어지는 순간 저장할 값이 정해지지 않는 경우
		// 일단, 공간을 먼저 만들어준 뒤 값을 넣는다.
		int[] jumsu = new int[10];
		jumsu[0] = 100;
		jumsu[9] = 200;

//		for (int i = 0; i < jumsu.length; i++) {
//			System.out.println(i + " : "+jumsu[i]);
//		}

		// foreach: 배열의 첫위치 값부터 하나씩,끝까지 오른쪽으로 가면서 자동으로 꺼내주는 반복문
		// length보다 작을때 까지. 꺼내서 확인해주는 용도로 배열에 값을 입력할때는 사용불가하다.
		for (int x : jumsu) {// i회차때 jumsu[i-1]의 값을 x에 넣는다!
			System.out.println(x);
		}

		// 저장공간이 만들어지는 순간 저장할 값이 정해져있는 경우
		// 공간 만들자마자, 초기값을 정해진 값으로 바로 넣는다.

		// int[] jumsu2 = {100, 200, 300};
	}

}
