package 조건문;

public class ifTest {

	public static void main(String[] args) {
		String data = "OK";
		if (data.equals("OK")) {
			System.out.println("긍정");
		} else if (data.equals("NO")) {
			System.out.println("부정");
		} else {
			System.out.println("뭐라는 거야");
		}

	}

}
