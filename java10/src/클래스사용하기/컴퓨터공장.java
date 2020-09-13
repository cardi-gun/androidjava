package 클래스사용하기;

import 클래스만들기.컴퓨터;

public class 컴퓨터공장 {

	public static void main(String[] args) {
		//객체 생성시 같은 패키기 내에서 일단 찾게 되고없으면 다른 패키기에서 찾게 된다.
		//다른패키지에 있는 객체를 사용하는 경우는 import로 경로를 명시해주어야 한다.
		//자동 import: 1)자동완성, 2)마우스를 올리고 선택or F2번으로 선택후 import
		//			  3)ctrl+shift+o(영문)
		컴퓨터 com1 = new 컴퓨터();
		//com1에는 지금 주소가 들어감, 주소로 가르키는 변수는 3가지 있다.
		//new를 하면 멤버 변수가 복사 되는데 멤버변수들은 자동초기화가 된다.
		//= 글로벌 변수는 자동초기화가 된다!
		com1.price=1000;
		com1.company="apple";
		com1.size= 30;
		
		System.out.println("com1의 가격은" + com1.price);
		System.out.println("com1의 제조사는" + com1.company);
		System.out.println("com1의 모니터크기는" + com1.size);
		System.out.println(com1);
		컴퓨터 com2 = new 컴퓨터();
		com2.price=3000;
		com2.company="banana";
		com2.size= 20;
		
		System.out.println("com2의 가격은" + com2.price);
		System.out.println("com2의 제조사는" + com2.company);
		System.out.println("com2의 모니터크기는" + com2.size);
		System.out.println(com2);
	}

}
