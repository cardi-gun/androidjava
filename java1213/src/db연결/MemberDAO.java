package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//CRUD중심으로 기능을 정의
//만들고 읽고 업데이트하고 삭제, 데이터와 관련된 작업
//(Data Access object : DAO)
public class MemberDAO {
	// 기능을 정의할 때는 메서드 (함수)를 사용

	public void create(String id, String pw, String name, String tel) throws Exception {// 모든 예외가 있을것 같은 건 예외처리
		// create 메서드 호출시 입력값을 받아주는 매개체 역할의 변수
		// =>매개변수(parameter, 파라메터)

		// public static void main(String[] s) throws Exception {//실행 확인 용
		// DB프로그램 절차에 맞춰서 코딩
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");// 외부에있는 파일과 연결할때는 예외처리가 필수다.
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		// String url = "연결하는방법://ip:prot/db명"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");
		// 3. sql문을 생성(create)
		String sql = "insert into member values(?,?,?,?)";// 순서대로 db table colum에 들어간다.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
	}
	 
	//vo로 받기!
	public void create(MemberVO vo) throws Exception {// 모든 예외가 있을것 같은 건 예외처리
		// create 메서드 호출시 입력값을 받아주는 매개체 역할의 변수
		// =>매개변수(parameter, 파라메터)

		// public static void main(String[] s) throws Exception {//실행 확인 용
		// DB프로그램 절차에 맞춰서 코딩
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");// 외부에있는 파일과 연결할때는 예외처리가 필수다.
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		// String url = "연결하는방법://ip:prot/db명"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");
		// 3. sql문을 생성(create)
		String sql = "insert into member values(?,?,?,?)";// 순서대로 db table colum에 들어간다.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());//가방에서 꺼내기
		ps.setString(2, vo.getPw());
		ps.setString(3, vo.getName());
		ps.setString(4, vo.getTel());
		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
	}

	public int read(String id) throws Exception {
		// create 메서드 호출시 입력값을 받아주는 매개체 역할의 변수
		// =>매개변수(parameter, 파라메터)

		// public static void main(String[] s) throws Exception {//실행 확인 용
		// DB프로그램 절차에 맞춰서 코딩
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");// 외부에있는 파일과 연결할때는 예외처리가 필수다.
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		// String url = "연결하는방법://ip:prot/db명"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");
		// 3. sql문을 생성(create)
		String sql = "select * from member where id = ?";// 순서대로 db table colum에 들어간다.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
		// 내용이 없을수도 많을수도 있다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공");
		int result = 0;
		if (rs.next()) {// 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있습니다.");
			result = 1;
			String id2 = rs.getString("id");
			String pw2 = rs.getString("pw");
			String name2 = rs.getString("name");
			String tel2 = rs.getString("tel");
			System.out.println("검색결과 id : " + id2);
			System.out.println("검색결과 pw : " + pw2);
			System.out.println("검색결과 name : " + name2);
			System.out.println("검색결과 tel : " + tel2);
		} else {
			System.out.println("검색결과가 없습니다.");
		}
		return result;// 0이 넘어가면 검색결과 없음, 1이 넘어가면 결과가 있음.
	}
	
	// 로그인 처리 id, pw 확인처리
	public MemberVO one(String id) throws Exception {
		// create 메서드 호출시 입력값을 받아주는 매개체 역할의 변수
		// =>매개변수(parameter, 파라메터)

		// public static void main(String[] s) throws Exception {//실행 확인 용
		// DB프로그램 절차에 맞춰서 코딩
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");// 외부에있는 파일과 연결할때는 예외처리가 필수다.
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		// String url = "연결하는방법://ip:prot/db명"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");
		// 3. sql문을 생성(create)
		String sql = "select * from member where id = ?";// 순서대로 db table colum에 들어간다.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
		// 내용이 없을수도 많을수도 있다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공");
		MemberVO bag = new MemberVO();
		
		
		if (rs.next()) {// 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있습니다.");
			String id2 = rs.getString("id");
			String pw2 = rs.getString("pw");
			String name2 = rs.getString("name");
			String tel2 = rs.getString("tel");
			//가방에 넣기 
			bag.setId(id2);
			bag.setPw(pw2);
			bag.setName(name2);
			bag.setTel(tel2);
			
			System.out.println("검색결과 id : " + id2);
			System.out.println("검색결과 pw : " + pw2);
			System.out.println("검색결과 name : " + name2);
			System.out.println("검색결과 tel : " + tel2);
		} else {
			System.out.println("검색결과가 없습니다.");
		}
		return bag;
		//bag은 참조형 변수, 
	}
	
	// 로그인 처리 id, pw 확인처리
	public boolean read(String id, String pw) throws Exception {
		// DB프로그램 절차에 맞춰서 코딩
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");// 외부에있는 파일과 연결할때는 예외처리가 필수다.
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		// String url = "연결하는방법://ip:prot/db명"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");
		// 3. sql문을 생성(create)
		String sql = "select * from member where id = ? and pw = ?";// 순서대로 db table colum에 들어간다.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
		// 내용이 없을수도 많을수도 있다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공");
		boolean result = false;// 없는게 기본값이 편하다
		if (rs.next()) {// 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("로그인 ok.");
			result = true;
			
		} else {
			System.out.println("로그인 not.");
		}
		return result;
		// false면 로그인not
		// true면 로그인 ok
	}

	public void update(String tel, String id) throws Exception {
		// create 메서드 호출시 입력값을 받아주는 매개체 역할의 변수
		// =>매개변수(parameter, 파라메터)

		// public static void main(String[] s) throws Exception {//실행 확인 용
		// DB프로그램 절차에 맞춰서 코딩
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");// 외부에있는 파일과 연결할때는 예외처리가 필수다.
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		// String url = "연결하는방법://ip:prot/db명"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");

		// 3. sql문을 생성(create)
		String sql = "update member set tel = ? where id=?";// 순서대로 db table colum에 들어간다.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
	}

	public void delete(String del) throws Exception {
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");
		// 3. sql문을 생성(create)
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, del);
		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
	}
}
