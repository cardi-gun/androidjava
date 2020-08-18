package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id = 1111;
		int pw = 2222;
		
		int logid = 1111;
		int logpw = 2000;
		
		if(id == logid && pw == logpw) {
			//and연산자, 여러 조건이 '모두' true일때, 전체 논리적인 판단을 true라고 한다.
			//비교하고싶은 조건이 두개이상일때 사용하는 연산자, 논리연산자
			System.out.println("로그인");
		}else {
			System.out.println("비로그인");
		}
		
		
		
	}

}
