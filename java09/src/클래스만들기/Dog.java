package 클래스만들기;

public class Dog {
	// 강아지
	// 종, 색, 나이, 무게

	String spec;
	String color;
	int age;
	double weight;

	// 짖다, 먹다, 놀다, 자다

	public void bark() {
		System.out.println("멍!");
	}

	public void eat() {
		System.out.println("강아지가 먹습니다.");
	}

	public void play() {
		System.out.println("강아지가 놉니다.");
	}

	public void sleep() {
		System.out.println("강아지가 잡니다.");
	}

}
