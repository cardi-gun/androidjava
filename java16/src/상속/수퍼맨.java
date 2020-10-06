package 상속;

public class 수퍼맨 extends 맨{
	//부모(맨의) 멤버변수 3개에 메서드 2개를(사람+맨) 상속받음
	
	boolean fly;
	
	
	
	public 수퍼맨(String name, int age, int power, boolean fly) {
		super(name, age, power);//자동으로 파라메터가 있는 부모를 넣어줘야 한다. 
		this.fly = fly;
	}

	public void space() {
		System.out.println("우주를 날다.");
	}

	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
