package 상속;

public class Coffee {

	public static void main(String[] args) {
		CoffeeTruck coffee = new CoffeeTruck();
		coffee.color = "brown";
		coffee.hp = 400;
		coffee.size = 120;
		coffee.make = true;
		
		coffee.selas();
		System.out.println(coffee);
		}

}
