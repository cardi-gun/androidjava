package dbcp;

public class ConManager {
	// 싱글톤 만들기

	static ConManager con = null;// 전역변수이기 때문에 자동초기화 되서 null이 없어도 상관없음

	// 객체가 이미 만들어져있는지 확인을 하고
	// 없으면 만들어주고 있으면 만들지 않고 리턴 해주는 메서드
	public static ConManager getInstance() {
		if (con == null) {
			con = new ConManager();
		}
		return con;

	}

}
