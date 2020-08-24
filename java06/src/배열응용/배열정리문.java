package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 문제
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println("첫번째 값과 두번째 값의 합은 : " + (num[0] + num[1]));

		// 2번 문제
		String[] subject = new String[3];
		for (int i = 0; i < subject.length; i++) {
			// 입력
			subject[i] = JOptionPane.showInputDialog("java,spring,jsp차례대로 입력하세요");
			System.out.println("과목입력 : " + subject[i]);
		}
		System.out.println(subject[0] + " 보다는 " + subject[1]);

		// 3번문제
		int[] num2 = { 11, 22, 33, 44 };
		// 타겟설정
		int target = 33;
		for (int i = 0; i < num2.length; i++) {
			if (target == num2[i]) {
				System.out.println("33은 " + i + "번 방, " + (i + 1) + "번째에 위치합니다.");
			}
		}
		// 4번 문제
		int[] num3 = new int[5];
		for (int i = 0; i < num3.length; i++) {
			// 5번 입력
			String input = JOptionPane.showInputDialog("1에서 5까지 차례대로 입력하세요");
			num[i] = Integer.parseInt(input);
			System.out.println((i + 1) + "번 째 숫자는 " + num[i]);
		}

		// 5번 문제
		int[] num4 = { 66, 77, 88, 99 };
		int max = num4[0];
		// 최대값 추출
		for (int i = 1; i < num4.length; i++) {
			if (max < num4[i]) {
				max = num4[i];
			}
		}
		System.out.println("최대값은 : " + max);

		// 6번 문제
		// 전체 배열 확인
		for (int i = 0; i < num4.length; i++) {
			System.out.print(num4[i] + "\t");
		}
		System.out.println(" ");
		// 최소값 추출
		int min = num4[0];
		for (int i = 0; i < num4.length; i++) {
			if (min > num4[i]) {
				min = num4[i];
			}
		}

		int maxnum = 0;
		int minnum = 0;
		int change = 0;
		// 최대, 최소 위치 확인
		for (int i = 0; i < num4.length; i++) {
			if (max == num4[i]) {
				maxnum = i;
			}
		}
		for (int i = 0; i < num4.length; i++) {
			if (min == num4[i]) {
				minnum = i;
			}
		}
		// 내용 변경
		change = num4[maxnum];
		num4[maxnum] = num4[minnum];
		num4[minnum] = change;
		for (int i = 0; i < num4.length; i++) {
			System.out.print(num4[i] + "\t");
		}
		System.out.println(" ");
		
		//문제 6 강사님 답.
		int[] num5 = { 66, 77, 88, 99 };
		for (int x : num5) {
			System.out.print(x + "\t");
		}
		System.out.println(" ");
		//num5[0] = num5[3];
		//num5[3] = num5[0];
		// => 99 77 88 99 가된다 첫줄에서 num5[0]에 99가 들어가있기 때문에.
		int imsi = num5[0];
		num5[0] = num5[3];
		num5[3] = imsi;
		for (int x : num5) {
			System.out.print(x + "\t");
		}
		
		
		
		
		
		
		
	}// main

}// class
