package 상속;

public class Car {
	String color;
	int hp;
	
	public void trunOn() {
		System.out.println("시동을 건다.");
	}
	public void ride() {
		System.out.println("운전 하다.");
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", hp=" + hp + "]";
	}
	
	
}
