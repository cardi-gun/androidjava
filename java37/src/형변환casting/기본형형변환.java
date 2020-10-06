package 형변환casting;

public class 기본형형변환 {

	public static void main(String[] args) {
		//primitive(원시적인, 가공되지 않은)data
		//변수(공간, 공간의 크기)에 대한 문제, 방의 크기에 대한 것을 고려해야 한다.
		//정수 byte(1)->short(2)->int(4)->long(8)
		byte a = 100; //byte : -128 ~ 127
		int b = a;//기본형 복사
		//byte(작) -> int(큰) : 자동형 변환
		
		//int c = 200;
		//byte d = c;
		//byte에 에초에 들어올수 없는 값, 잘라서 넣을수 있긴 하지만 전혀 다른 수가 나오게 된다
		
		int c = 120;
		byte d = (byte) c;
		//int (큰) -> byte(작) : 강제 형변환
		//4개의 방을 쓰던 int에서 byte로 방을 하나로 줄여준다.
		
	}

}
