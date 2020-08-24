package 배열응용;

import java.util.Random;

public class 답안지 {

	public static void main(String[] args) {
		// 1000문제에 대한
		// 원래 답안지 0~3까지 중 1000개를 만들어라
		// 내 답안지 0~3까지 1000개를 만든다
		// 채점을 해보고 결과 출력
		Random r = new Random();
		//배열생성
		int[] quiz = new int[1000];
		int[] answer = new int[1000];
		//카운트 변수 생성
		int right = 0;
		int wrong = 0;
		System.out.println("문항\t정답\t내답\t처리");
		//문제, 정답 반복 출력
		for (int i = 0; i < quiz.length; i++) {
			quiz[i] = r.nextInt(4);
			System.out.print(i +"\t"+ quiz[i]);
			answer[i] = r.nextInt(4); 
			System.out.print("\t"+answer[i]+"\t");
			if(quiz[i]==answer[i]) {
				System.out.println("정답");
				right++;
			}else {
				System.out.println("오답");
				wrong++;
			}
		}
		//결과 출력
		System.out.println("정답의 갯수는 : "+right);
		System.out.println("오답의 갯수는 : "+wrong);
	}//main
}//class
