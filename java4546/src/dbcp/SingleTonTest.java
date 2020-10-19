package dbcp;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConManager con = ConManager.getInstance();
		System.out.println(con);
		ConManager con2 = ConManager.getInstance();
		System.out.println(con2);
	}

}
