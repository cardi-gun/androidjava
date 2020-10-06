package 상속;

public class 사람 extends Object{//기본적으로 object을 상속받고있다.
	//멤버변수, 멤버메서드
	String name;
	int age;
	
	
	//파라메터가 있는 생성자를 정의하게 되면,
	//기본생성자는 자동으로 만들어지지 않는다.
	//new 사람() ;//불가
	
	public 사람(String name, int age) {
		super(); //== object(); 부모의 기본생성자 호출시 super사용
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("먹습니다.");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
