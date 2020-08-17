package data;

public class IndexString1 {
	//코드자동정리 ctrl + shift + F
	public static void main(String[] args) {
		//기본데이터는 아닌데 사람이 워낙 많이 쓰는 데이터의 형태이므로
		//기본데이터처럼 쓰게 해놓은 문자열을 나타내는 키워드 = String
		
		String name ="김창희";
		//String은 name 이라는 변수에 들어갈 데이터의 유형
		//data type(자료형)
		
		String company = "메가더조은";
		System.out.println(name+"은"+company+"소속이다");
		//+: 하나라도 String이면 모두다 String으로 결합된다.
		int age = 28;
		System.out.println(name +"의 나이는"+age);
		//age도 스트링이된다.
		String subject; //선언! => 메모리 할당
		subject = "자바";// 처음값 입력(초기화), 대입연산자(=)
		//String subject = "java" 로  뒤에 선언하면 에러가 일어남.두번선언 X
		System.out.println("내 과목은"+subject);
		
		String day;
		//System.out.println(day);
		//쓰레기값 상태 선언 만 되어있는 상황
		//연산도 안되며 출력도 안된다. 
		
		
		
		
	}

}
