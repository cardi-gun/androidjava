package 이차원배열;

import java.util.Scanner;

public class 성적관리 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요");
		System.out.println("------------------------------");		
		System.out.println("1학기 \t\t 2학기");
		System.out.println("중간고사 | 기말고사 | 중간고사 | 기말고사");
		//성적을 띄어쓰기를 기준으로 점수 입력
		String input = scan.nextLine();
		//띄어쓰기, 공백을 기준으로 문자열 배열에 입력
		String[] Sgrade = input.split(" ");
		//문자열 배열의 크기 만큼 정수형 배열 생성
		int[] grade = new int[Sgrade.length];
		
		for (int i = 0; i < Sgrade.length; i++) {
			//생성한 정수형 배열에 문자열 배열속 점수를 정수형으로 변경하여 입력
			grade[i] = Integer.parseInt(Sgrade[i]);
		}
		//동일 학기내 성적 비교
		System.out.print("1학기 ");
		if(grade[0]>grade[1]) {
			System.out.println("중간보다 기말 성적이 떨어졌습니다.");
		}else if(grade[0]==grade[1]){
			System.out.println("성적이 유지되었습니다.");
		}else {
			System.out.println("중간보다 기말 성적이 올라갔습니다.");
		}
		
		System.out.print("2학기 ");
		if(grade[2]>grade[3]) {
			System.out.println("중간보다 기말 성적이 떨어졌습니다.");
		}else if(grade[2]==grade[3]){
			System.out.println("성적이 유지되었습니다.");
		}else {
			System.out.println("중간보다 기말 성적이 올라갔습니다.");
		}
		
		//학기별 성적 합산
		System.out.println("1학기 성적 : "+(grade[0]+grade[1])+"\t 2학기 성적 : "+ (grade[2]+grade[3]));

		//학기별 성적비교
		if((grade[0]+grade[1]) > (grade[2]+grade[3])) {
			System.out.println("1학기보다 2학기 성적이 떨어졌습니다.");
		}else if((grade[0]+grade[1]) == (grade[2]+grade[3])){
			System.out.println("성적이 유지되었습니다.");
		}else {
			System.out.println("1학기보다 2학기 성적이 올라갔습니다.");
		}
		

	}

}
