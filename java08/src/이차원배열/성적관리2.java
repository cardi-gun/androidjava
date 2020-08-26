package 이차원배열;

import java.util.Scanner;

public class 성적관리2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//점수 계산할 학생의 수 입력
		System.out.print("학생의 수를 입력하세요 :");
		int student = scan.nextInt();
		//이름, 점수, 1학기, 2학기, 잘한학기 , 총점
		String[][] grade = new String[student][6];
		
		for (int i = 0; i < student; i++) {
			System.out.println("==============================");
			System.out.print("학생의 이름을 입력하세요 :");
			grade[i][0] = scan.next();
			System.out.println("성적을 입력하세요");
			System.out.println("==============================");
			System.out.println("1학기 \t\t 2학기");
			System.out.println("중간고사 | 기말고사 | 중간고사 | 기말고사");
			
			// 성적을 띄어쓰기를 기준으로 점수 입력
			scan.nextLine();
			grade[i][1] = scan.nextLine();
			String[] result = grade[i][1].split(" ");
			
//			System.out.println(result.length);
//			for (int j = 0; j < result.length; j++) {
//				System.out.println(result[j] + "=============");
//			}
//			System.out.println(grade[i][1]);
			
			//입력된 점수를 기준으로 잘라낸 단위 만큼 배열 생성
			int[] score = new int[result.length];
			for (int j = 0; j < result.length; j++) {
				// 생성한 정수형 배열에 문자열 배열속 점수를 정수형으로 변경하여 입력
				score[j] = Integer.parseInt(result[j]);
			}

			// 동일 학기내 성적 비교
			System.out.print("1학기 ");
			if (score[0] > score[1]) {
				System.out.println("중간보다 기말 성적이 떨어졌습니다.");
			} else if (score[0] == score[1]) {
				System.out.println("성적이 유지되었습니다.");
			} else {
				System.out.println("중간보다 기말 성적이 올라갔습니다.");
			}
			//1학기 총점 입력
			grade[i][2] = Integer.toString(score[0] + score[1]);
			
			System.out.print("2학기 ");
			if (score[2] > score[3]) {
				System.out.println("중간보다 기말 성적이 떨어졌습니다.");
			} else if (score[2] == score[3]) {
				System.out.println("성적이 유지되었습니다.");
			} else {
				System.out.println("중간보다 기말 성적이 올라갔습니다.");
			}
			//2학기 총점 입력
			grade[i][3] = Integer.toString(score[2] + score[3]);
			
			// 학기별 성적 합산
			System.out.println("1학기 성적 : " + (score[0] + score[1]) + "\t 2학기 성적 : " + (score[2] + score[3]));

			// 학기별 성적비교
			if ((score[0] + score[1]) > (score[2] + score[3])) {
				System.out.println("1학기보다 2학기 성적이 떨어졌습니다.");
				//잘한 학기 입력
				grade[i][4] = "1학기";
			} else if ((score[0] + score[1]) == (score[2] + score[3])) {
				System.out.println("성적이 유지되었습니다.");
				grade[i][4] = "똑같음.";
			} else {
				System.out.println("1학기보다 2학기 성적이 올라갔습니다.");
				grade[i][4] = "2학기";
			}
			//총점 입력
			grade[i][5] = Integer.toString(score[0] + score[1] + score[2] + score[3]);
			System.out.println("");
		} // for
		
		//학생 수 만큼 정보 반복 출력
		for (int j = 0; j < grade.length; j++) {
			System.out.println("==============================");
			System.out.println("학생 이름 : " + grade[j][0] +"\t 학생점수 : " + grade[j][1]);
			System.out.println("1학기 성적 : "+ grade[j][2] +"\t 2학기 성적 : "+grade[j][3]); 
			System.out.println("잘한 학기 : "+ grade[j][4]+"\t 총점 : "+grade[j][5]);
		}
		
		
		
		
		
		
	}// main
	
}// class