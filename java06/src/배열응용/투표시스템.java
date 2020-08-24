package 배열응용;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 투표대상 배열선언
		String[] names = { "블랙핑크", "유재석", "아이유", "이효리", "비" };
		// 투표수배열 선언
		int[] count = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < 10; i++) {
			String input = JOptionPane.showInputDialog("블랙핑크, 유재석, 아이유, 이효리, 비 중에 투표하세요");

			/*
			 * String choice =
			 * JOptionPane.showInputDialog("0) 블랙핑크, 1)유재석, 2)아이유, 3)이효리, 4)비 중에 투표하세요");
			 * int choice 2 = Integer.parseInt(choice);
			 * 
			 * if (!(choice2<0 || choice2>4)){ 
			 * 	count[choice2]++; 
			 * }
			 */

			// String의 비교는 equals로 한다.
			if (input.equals("블랙핑크")) {
				count[0]++;
			} else if (input.equals("유재석")) {
				count[1]++;
			} else if (input.equals("아이유")) {
				count[2]++;
			} else if (input.equals("이효리")) {
				count[3]++;
			} else if (input.equals("비")) {
				count[4]++;
			} else {
				System.out.println("입력실패");
				i--;
			}
		}

		System.out.println("1)");
		// i값에 따른 투표결과
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + "번은 " + count[i] + "표");
		}

		System.out.println("2)");
		// i값을 names 배열에 넣은 투표결과
		for (int i = 0; i < count.length; i++) {
			System.out.println(names[i] + "는 " + count[i] + "표");
		}
		// 최대값 변수 생성
		int max = count[0];
		// i기록 변수 생성
		int check = 0;
		// 최대값 기록
		for (int i = 1; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				check = i;
			}
		}
		System.out.println("3)");
		System.out.println("1등 : " + names[check] + "," + count[check] + "표");

		// 2등생성
		count[check] = 0;
		// 최대값 값 변경
		int max2 = count[0];
		// 기록변수 생성
		int check2 = 0;
		for (int i = 1; i < count.length; i++) {
			if (max2 < count[i]) {
				max2 = count[i];
				check2 = i;
			}
		}
		System.out.println("2등 : " + names[check2] + "," + count[check2] + "표");
		
		
		
		
		
		
	}// main

}// class
