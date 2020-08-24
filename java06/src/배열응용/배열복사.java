package 배열응용;

public class 배열복사 {

	public static void main(String[] args) {
		//배열생성
		String[] subject = { "국어", "수학", "과학", "컴퓨터", "영어" };
		int[] score = { 100, 99, 77, 87, 66 };
		//점수 배열 복사
		int[] score2 = score.clone();
		//배열점수 수정
		score2[2] = 44;
		score2[4] = 55;
		
		//1) 배열출력
		for (String s : subject) {
			System.out.print(s + "\t");
		}
		System.out.println("\n----------------------------------------");
		for (int x : score) {
			System.out.print(x + "\t");
		}
		System.out.println("\n----------------------------------------");
		for (int x : score2) {
			System.out.print(x + "\t");
		}
		//2) 배열 비교 후 변경 갯수 출력
		int change = 0;
		for (int i = 0; i < subject.length; i++) {
			if (score[i] != score2[i]) {
				change++;
			}
		}
		System.out.println("\n----------------------------------------");
		System.out.println("점수가 변경된 과목은 " + change + "개");
		
		//3)더 높은 점수를 기록한 쪽 출력(같은 값)
		double total = 0;
		for (int i = 0; i < score.length; i++) {
			total = total + score[i];

		}
		double total2 = 0;
		for (int i = 0; i < score2.length; i++) {
			total2 = total2 + score2[i];
		}
		if (total > total2) {
			System.out.println("평균이 더 높은 쪽은 1학기로 평균은 " + (total / 5) + "점 입니다");
		} else {
			System.out.println("평균이 더 높은 쪽은 2학기로 평균은 " + (total2 / 5) + "점 입니다");
		}
		//4)점수 변경 과목 문자열 배열 출력
		System.out.print("점수가 변경된 과목은");
		for (int i = 0; i < subject.length; i++) {
			if (score[i] != score2[i]) {
				System.out.print(" " + subject[i]);
			}
		}
		System.out.print("입니다.");
	}// main

}// class
