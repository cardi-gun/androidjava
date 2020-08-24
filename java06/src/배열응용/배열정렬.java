package 배열응용;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = { 99, 38, 10, 29, 49, 84, 53, 21, 77, 6};
		
		//age.clone();//복사, 복제 함수 RAM에 있는 원본(배열의 내용)을 복사하고 CUP에 임시 보관하고 있기 때문에 배열을 선언해줘야한다.	
		//배열은 깊은 복사(배열안의 값을 전부 가져오는 복사)를 해야한다.
		//깊은복사를 해야 배열은 따로 따로 만들어진다. 
		int[] age2 = age.clone();
		for (int x : age) {
			System.out.print(x + "\t");
		}
		System.out.println(" ");
		
		age2[0] = 999;
		
		for (int x : age2) {
			System.out.print(x + "\t");
		}
		System.out.println("\n-----------------------------");

		Arrays.sort(age);//오름차순으로 정렬.
		//sort는 CPU에서 정렬하고 RAM에 저장까지 하는 function이다.
		
		for (int x : age) {
			System.out.print(x + " ");

		}
	}

}
