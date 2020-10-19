package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class NewsDAO {
	// 전역변수로 빼내기
	String url = "jdbc:mysql://localhost:3366/shop?useUnicode=true&characterEncoding=utf8";
	String user = "root";
	String password = "1234";
	Connection con;

	public NewsDAO() throws Exception {
		//생성자의 역할 : 객체 생성시 반드시 처리해야할 내용이 있으면 생성자에 넣는다.
		// DB프로그램 절차에 맞추어서 코딩
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공.!!");

		// 2. db연결
		// String url = "연결하는방법://ip:port/db명";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");
	}

	// 기능을 정의할 때는 메서드(함수)를 사용
	// 컨트롤+쉬프트+f(화면 자동 정리)
	// create메서드 호출시 입력값을 받아주는 중간 매개체 역할의 변수
	// => 매개변수(parameter, 파라메터)
	public boolean create(NewsVO vo) throws Exception {
		// 3. sql문을 만든다.(create)
		String sql = "insert into news values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getTitle());
		ps.setString(2, vo.getPubDate());
		ps.setString(3, vo.getLink());
		ps.setString(4, vo.getGuid());
		ps.setString(5, vo.getAuthor());
		ps.setString(6, vo.getThumbnail());
		ps.setString(7, vo.getDescription());
		ps.setString(8, vo.getContent());
		ps.setString(9, vo.getEnclosure());
		ps.setString(10, vo.getCategories());

		System.out.println("3. SQL생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		// 5. 데이터 정리, 연결 끊기
		ps.close();
		con.close();
		return result;
	}

}
