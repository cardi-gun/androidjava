package DB연결하기;

public class 에러찾기 {

	public static void main(String[] args) throws Exception {
		int x = 10 / 0;
		
//		try {//에러날거같은부분 넣어 놓음
//			int x = 10 / 0;
//
//		} catch (Exception e) {//에러가 나면 적절하게 처리후 밑의 동작 실행
//			System.out.println("산술연산 에러.");
//		}
		
		System.out.println("이거는 실행가능");
	}

}
