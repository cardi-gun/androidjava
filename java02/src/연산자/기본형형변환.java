package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//큰<-작 : 자동형변환
		int x = 100; //int의 범위는 -21억 ~ 21억, 4바이트
		byte y = 120; // byte의 -128 ~ 127 그 이상의 수를 넣으면 에러, 1바이트
		x = y;
		System.out.println(x);
		//작<-큰 : 강제형변환, ()를 사용 
		//()안에는 다루려 하는 데이터의 형을 넣는다.
		int z = 127;
		//byte w = z; 4바이트를 사용하던 z는 1바이트 공간에 들어가지 않아 잘라줘야 한다.
		byte w = (byte)z;
		System.out.println(z);
		
		int q = 1000;
		//byte t = q; 1000이 이미 byte의 크기를 넘은상태는 강제로 변환할수가 없다. 
		//강제형변환하는 경우는 강제로 변환하고자 하는 타입범위 내에 값이 들어가야한다.
		
		
	}

}
