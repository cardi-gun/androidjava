package 배열정리;

public class 이차원배열 {

	public static void main(String[] args) {

		int[][] seat = new int[3][5];
		// 배열을 선언하는 순간 공간이 할당된다.
		// seat : 참조형 변수 (주소가 들어가는 변수)
		// int[3][5] : 기본형 변수(값)
		// 배열은 자동초기화가 된다. int -> 0

		System.out.println(seat);// 저장되어있는 주소!

		System.out.println("행의 갯수 : "+seat.length);//전체 행의 개수
		
		for (int i = 0; i < seat.length; i++) {//전체 행의 개수 : 0,1,2
			for (int j = 0; j < seat[i].length; j++) {//각 i 줄의 길이 = 열의 개수
				System.out.print(seat[i][j]+" ");
			}
			System.out.println("");
		}
		//   0 1 2 3 4
		// 0 0 0 0 0 0
		// 1 0 0 0 0 0
		// 2 0 0 0 0 0
		System.out.println("");
		
		seat[0][0] = 1;
		seat[0][4] = 1;
		seat[2][4] = 1;

		for (int i = 0; i < seat.length; i++) {//전체 행의 개수 : 0,1,2
			for (int j = 0; j < seat[i].length; j++) {//각 i 줄의 길이 = 열의 개수
				System.out.print(seat[i][j]+" ");
			}
			System.out.println("");
		}
		//   0 1 2 3 4
		// 0 1 0 0 0 1
		// 1 0 0 0 0 0
		// 2 0 0 0 0 1
		System.out.println("");
		
		seat[1][2] = 1;
		seat[2][1] = 1;

		for (int i = 0; i < seat.length; i++) {//전체 행의 개수 : 0,1,2
			for (int j = 0; j < seat[i].length; j++) {//각 i 줄의 길이 = 열의 개수
				System.out.print(seat[i][j]+" ");
			}
			System.out.println("");
		}
		//   0 1 2 3 4
		// 0 1 0 0 0 1
		// 1 0 0 1 0 0
		// 2 0 1 0 0 1
	}

}
