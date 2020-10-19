package dbcp;

public class SingleTonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConManager con = ConManager.getInstance();
		System.out.println(con);
		ConManager con2 = ConManager.getInstance();
		System.out.println(con2);

		DAOManager dao = DAOManager.getInstance();
		System.out.println(dao);
		DAOManager dao1 = DAOManager.getInstance();
		System.out.println(dao1);
		DAOManager dao2 = DAOManager.getInstance();
		System.out.println(dao2);
		DAOManager dao3 = DAOManager.getInstance();
		System.out.println(dao3);
		DAOManager dao4 = DAOManager.getInstance();
		System.out.println(dao4);
		DAOManager dao5 = DAOManager.getInstance();
		System.out.println(dao5);
		DAOManager dao6 = DAOManager.getInstance();
		System.out.println(dao6);
		DAOManager dao7 = DAOManager.getInstance();
		System.out.println(dao7);
		DAOManager dao8 = DAOManager.getInstance();
		System.out.println(dao8);
		DAOManager dao9 = DAOManager.getInstance();
		System.out.println(dao9);

	}

}
