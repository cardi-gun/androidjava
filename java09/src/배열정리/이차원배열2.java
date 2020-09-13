package 배열정리;

public class 이차원배열2 {

	public static void main(String[] args) {
		
		int[][] seat = new int [3][];// 각 행의 길이가 다를때
		//2차원배열은 1차원 배열은 붙인것
		//2차원 배열 seat에 각 배열을 붙여준다.
		int[]s1 = new int[3];
		int[]s2 = new int[4];
		int[]s3 = new int[5];
		
		seat[0]= s1;
		seat[1]= s2;
		seat[2]= s3;
		
		for (int i = 0; i < seat.length; i++) {// 전체 행 출력을 위해 seat.length = 3 의 길이를 사용
			for (int j = 0; j < seat[i].length; j++) {//각 행의 길이가 다르기 때문에 seat[i]를 사용!
				System.out.print(seat[i][j]+" ");
			}
			System.out.println("");
		}
		
		//각 과목별응시가 수가 다름
		//국어 응시자 점수 = 50 60 70 80 90
		//수학 = 66 77 88
		//영어 = 90 80 70 60
		//과학 = 77 100
		
		int[][]grade = new int[4][];
		
		int[] kor = {50, 60, 70, 80, 90};
		int[] math = {66, 77, 88};
		int[] eng = {90, 80, 70, 60};
		int[] sie = {77, 100};
		
		grade[0] = kor;
		grade[1] = math;
		grade[2] = eng;
		grade[3] = sie;
		
		for (int i = 0; i < grade.length; i++) {// 전체 행 출력을 위해 seat.length = 3 의 길이를 사용
			for (int j = 0; j < grade[i].length; j++) {//각 행의 길이가 다르기 때문에 seat[i]를 사용!
				System.out.print(grade[i][j]+" ");
			}
			System.out.println("");
		}
	}//main

}//class
