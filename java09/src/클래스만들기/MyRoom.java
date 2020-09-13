package 클래스만들기;

public class MyRoom {

	public static void main(String[] args) {
		Cellphone p1 = new Cellphone();
		//p1변수 생성 => 멤버 변수들을 가리키는 주소가 들어감
		//color size company 멤버변수 복사 => 자동초기화
		System.out.println(p1.color);
		System.out.println(p1.size);
		System.out.println(p1.company);

		//멤버 변수에 값입력
		p1.color = "흰색";
		p1.size = 7;
		p1.company ="삼성";
		
		System.out.println("p1휴대폰의 색은 "+p1.color);
		System.out.println("p1휴대폰의 크기는 "+p1.size);
		System.out.println("p1휴대폰의 제조사는 "+p1.company);
		System.out.println(p1);
		p1.messege();

		System.out.println("--------------------");
		Cellphone p2 = new Cellphone();
		p2.color = "골드";
		p2.size = 11;
		p2.company ="애플";
		
		System.out.println("p2휴대폰의 색은 "+p2.color);
		System.out.println("p2휴대폰의 크기는 "+p2.size);
		System.out.println("p2휴대폰의 제조사는 "+p2.company);
		System.out.println(p2);
		p2.call();
		System.out.println("--------------------");

		Dog d1 = new Dog();
		d1.spec = "골든리트리버";
		d1.color = "갈색";
		d1.age = 5;
		d1.weight = 23.2;
		
		System.out.println("d1의 종은 "+d1.spec);
		System.out.println("d1의 색은 "+d1.color);
		System.out.println("d1의 나이는 "+d1.age);
		System.out.println("d1의 몸무게는 "+d1.weight);
		d1.bark();
		d1.play();
		System.out.println("--------------------");
		
		Dog d2 = new Dog();
		d2.spec = "보더콜리";
		d2.color = "점박이";
		d2.age = 3;
		d2.weight = 16.7;
		
		System.out.println("d2의 종은 "+d2.spec);
		System.out.println("d2의 색은 "+d2.color);
		System.out.println("d2의 나이는 "+d2.age);
		System.out.println("d2의 몸무게는 "+d2.weight);
		d2.eat();
		d2.sleep();
		System.out.println("--------------------");
		
	}

}
