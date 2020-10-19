package dbcp;

public class DAOManager {

	static DAOManager dao = null;
	
	public static DAOManager getInstance() {
		if(dao == null) {
			dao = new DAOManager();
		}
		return dao;
	}
}
