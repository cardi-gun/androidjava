package 상속;

public class CoffeeTruck extends Truck{
	boolean make;
	
	public void selas() {
		carryOn();
		System.out.println("판매하다.");
	}
	
	
	@Override
	public String toString() {
		return "CoffeeTruck [make=" + make 
				+ ", size=" + size + ", color=" 
				+ color + ", hp=" + hp + "]";
	}
	
}
