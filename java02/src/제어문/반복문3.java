package 제어문;

public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exam 1) 100부터 1까지 프린트
		int start1 = 100;//시작값 선언, 초기화
		int end1 = 1;//종료값
		//int add1 = -1;//증감값
		while(start1 >= end1) { //100이 1보다 큰동안
			System.out.println(start1);
			//시작값 start1 출력
			//start1 = start1 + add1;
			//시작값에 증감값 -1을 추가 하여 다시 시작값에 저장.
			start1--;//증감연산자.
		}
		
		int start2 = 5;//시작값
		int end2 = 10;//종료값
		//int add2 = 1;//증감값
		while(start2 <= end2) { // 10이 5보다 큰동안
			System.out.println(start2);
			//시작값 start2 출력
			//start2 = start2 + add2;
			//시작값에 증가값 1을 추가 하여 다시 시작값에 저장.
			start2++;//증감연산자.
		}
		
		int start3 = 1;//시작값
		int end3 = 100;//종료값
		int add3 = 2;//증감값
		while(start3 <= end3) { //100이 1보다 큰동안
			System.out.println(start3);
			//시작값 start3 출력
			start3 = start3 + add3;
			//시작값에 증가값 2를 추가 하여 다시 시작값에 저장.
		}
		
	}

}
