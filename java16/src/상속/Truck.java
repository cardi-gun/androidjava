package 상속;

public class Truck extends Car{
	int size;
	
	public void carryOn() {
		System.out.println("물건을 싣다.");
	}

	@Override
	public String toString() {
		return "Truck [size=" + size + ", color=" 
	+ color + ", hp=" + hp + "]";
	}
	
	
}
