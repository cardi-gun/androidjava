package 상속;

public class 맨 extends 사람{
	//사람의멤버변수2개, 메서드1개를 상속받고 있음
	int power;
	
	public 맨(String name, int age, int power) {
		super(name, age);
		this.power = power;
	}

	public void run() {
		eat();//부모의 메서드는 자식 클래스에서 바로 호출이 가능하다
		System.out.println("달립니다.");
	}
	
	@Override
	public String toString() {
		//상속받은 name과 age또한 출력이 가능하다.
		return "맨 [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
