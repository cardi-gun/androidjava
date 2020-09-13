package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BbsDAO {
	public void create(BbsVO vo) throws Exception {// 모든 예외가 있을것 같은 건 예외처리
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");// 외부에있는 파일과 연결할때는 예외처리가 필수다.
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		// String url = "연결하는방법://ip:prot/db명"
		String url = "jdbc:mysql://localhost:3366/shop1?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");
		// 3. sql문을 생성(create)
		String sql = "insert into bbs values(?,?,?,?)";// 순서대로 db table colum에 들어간다.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getNo());// 가방에서 꺼내기
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getWriter());
		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
	}

	public void read() {

	}

	public void update(BbsVO vo) throws Exception {
		// create 메서드 호출시 입력값을 받아주는 매개체 역할의 변수
		// =>매개변수(parameter, 파라메터)

		// public static void main(String[] s) throws Exception {//실행 확인 용
		// DB프로그램 절차에 맞춰서 코딩
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");// 외부에있는 파일과 연결할때는 예외처리가 필수다.
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		// String url = "연결하는방법://ip:prot/db명"
		String url = "jdbc:mysql://localhost:3366/shop1?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");

		// 3. sql문을 생성(create)
		String sql = "update bbs set content = ? where no=?";// 순서대로 db table colum에 들어간다.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getContent());
		ps.setInt(2, vo.getNo());

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
	}

	public void delete(BbsVO vo) throws Exception {
		// 1. connector설정 (driver)
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 설정완료!");
		// 2. db연결 (ip, id, pw)
		String url = "jdbc:mysql://localhost:3366/shop1?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 완료!");
		// 3. sql문을 생성(create)
		String sql = "delete from bbs where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getNo());
		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
	}

	public BbsVO one(int no) throws Exception {
//      DB프로그램 절차에 맞추어서 코딩
//      1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공.!!");

		// 2. db연결
//           String url = "연결하는방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");

		// 3. sql문을 만든다.
		String sql = "select * from bbs where no = ?";
		// select * from member where id = 'park' //setString
		// select * from bbs where no = 1 //setInt
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		BbsVO bag = new BbsVO();// 가방만들어서,
		if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요.");
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			// 가방에 넣기
			bag.setNo(no2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			System.out.println("검색결과 ino2: " + no2);
			System.out.println("검색결과 title: " + title);
			System.out.println("검색결과 content: " + content);
			System.out.println("검색결과 writer: " + writer);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		return bag;
		// bag은 참조형 변수, 주소를 전달!

	}

	public ArrayList<BbsVO> all() throws Exception {

//      DB프로그램 절차에 맞추어서 코딩
//      1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공.!!");

		// 2. db연결
//           String url = "연결하는방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");

		// 3. sql문을 만든다.
		String sql = "select * from bbs";
		// select * from member where id = 'park' //setString
		// select * from bbs where no = 1 //setInt
		PreparedStatement ps = con.prepareStatement(sql);
		

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		//1. resultset으로 data 받아오기
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		
		//arraylist라는 컨테이너에 bbsvo 가방들을 넣는 과정
		//<>안에 컨테이너에 무엇을 넣을지 지정.
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		
		while (rs.next()) { // 3.data가 있는지 없는지 체크해주는 메서드
			BbsVO bag = new BbsVO(); //4.넣을 가방 만들기
			//3.data 가져오기
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			
			//4.가방에 넣기 
			bag.setNo(no2); //커서(위치를 알려주는 역할)
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
//			System.out.println("검색결과 ino2: " + no2);
//			System.out.println("검색결과 title: " + title);
//			System.out.println("검색결과 content: " + content);
//			System.out.println("검색결과 writer: " + writer);
			//5.컨테이너에 넣기
			list.add(bag);
		} 
		return list; 
		// bag은 참조형 변수, 주소를 전달!

	}
}
