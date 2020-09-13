package DB연결하기;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;



//특정한 방법을 처리하는 클래스 = 방법(model)클래스 
public class DB처리전담 {
	public void create(String id, String pw, String name, String tel) throws Exception {
		// DB처리하는 방법이 4단계로 정해져 있다.

		System.out.println("DB에 저장 처리 함.");
		// 1.connector 설정
		Class.forName("com.mysql.jdbc.Driver");// 커넥터 설정 메소드
		// 자바에서는 에러가 너무 많이 발생할거 같은 상황에서는 반드시
		// 에러처리를 반드시 해주어야 한다.
		// 네트워크연결, db연결, 파일연결, cpu연결 시에는 반드시 사용해줘야한다.

		System.out.println("1. connector 설정 성공!");
		// 2.db연결
		// 1)url : ip+port+db명
		// 2)username: root
		// 3)password: 1234
		
		//정해진문법"자바와데이터베이스커넥트:db명://위치:포트/이름"
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. shop 연결 성공!");
		//**db연동하는 인덱스는 1부터 시작한다!
		String sql = "insert into member1 values(?,?,?,?)";
		//컴퓨터는 이 문장을 그냥 String으로 인식한다.
		PreparedStatement ps = con.prepareStatement(sql);
		//**db연동하는 인덱스는 1부터 시작한다!
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL문 생성 성공!");
		
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!");
	}

	

	public void read() {// db에서 가져오는 기능
		JOptionPane.showMessageDialog(null, "DB에 검색 처리 함.");

	}

	public void update() {// db로 보내는 기능
		JOptionPane.showMessageDialog(null, "DB에 수정 처리 함.");

	}

	public void delete() {// db로 보내는 기능
		JOptionPane.showMessageDialog(null, "DB에 삭제 처리 함.");

	}
}
