package BCbean;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class ClassDAO2 {
	// 기능을 정의할 때는 메서드(함수)를 사용한다.
	Connection con;
	DBConnectionMgr dbcp;

	public ClassDAO2() throws Exception {
		dbcp = DBConnectionMgr.getInstance();
		/*
		 * // DB프로그램 절차에 맞게 코딩 // 1. connector 설정
		 * Class.forName("com.mysql.jdbc.Driver");
		 * System.out.println("1. connector 연결"); // 2. db연결 // String url
		 * "연결하는방법://ip:port/db명"; String url =
		 * "jdbc:mysql://localhost:3366/betterclass?useUnicode=true&characterEncoding=utf8";
		 * String user = "root"; String password = "1234"; con =
		 * DriverManager.getConnection(url, user, password);
		 * 
		 * System.out.println("2. db연결성공!");
		 */
	}

	// main 인기강좌 목록
	public List<ClassVO> bestread() throws Exception {
		con = dbcp.getConnection();

		String sql = "select * from class";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
		// 내용이 없을수도 많을수도 있다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공");
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
		List<ClassVO> list = new ArrayList<ClassVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			ClassVO bag = new ClassVO();
			// 가방에 넣기
			bag.setcCode(rs.getInt("cCode"));
			bag.setcTitle(rs.getString("cTitle"));
			bag.setcType(rs.getString("cType"));
			bag.setcDate(rs.getDate("cDate"));
			bag.setcDay(rs.getString("cDay"));
			bag.setcTime(rs.getTime("cTime"));
			bag.setcAddress(rs.getString("cAddress"));
			bag.setcInfo(rs.getString("cInfo"));
			bag.setcLimit(rs.getByte("cLimit"));
			bag.setcPrice(rs.getInt("cPrice"));
			bag.setcImg(rs.getString("cImg"));
			bag.settID(rs.getString("tID"));
			list.add(bag);
		}
		dbcp.freeConnection(con, ps, rs);
		return list;
	}

	// main 최신강좌 목록
	public List<ClassVO> recentread() throws Exception {
		con = dbcp.getConnection();

		String sql = "select * from class order by cCode desc";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
		// 내용이 없을수도 많을수도 있다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공");
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
		List<ClassVO> list = new ArrayList<ClassVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			ClassVO bag = new ClassVO();
			// 가방에 넣기
			bag.setcCode(rs.getInt("cCode"));
			bag.setcTitle(rs.getString("cTitle"));
			bag.setcType(rs.getString("cType"));
			bag.setcDate(rs.getDate("cDate"));
			bag.setcDay(rs.getString("cDay"));
			bag.setcTime(rs.getTime("cTime"));
			bag.setcAddress(rs.getString("cAddress"));
			bag.setcInfo(rs.getString("cInfo"));
			bag.setcLimit(rs.getByte("cLimit"));
			bag.setcPrice(rs.getInt("cPrice"));
			bag.setcImg(rs.getString("cImg"));
			bag.settID(rs.getString("tID"));
			list.add(bag);
		}

		dbcp.freeConnection(con, ps, rs);

		return list;
	}

	/*
	public List<ClassVO> bestread() throws Exception {
		con = dbcp.getConnection();

		String sql = "select * from class";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
		// 내용이 없을수도 많을수도 있다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공");
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
		List<ClassVO> list = new ArrayList<ClassVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			ClassVO bag = new ClassVO();
			// 가방에 넣기
			bag.setcCode(rs.getInt("cCode"));
			bag.setcTitle(rs.getString("cTitle"));
			bag.setcType(rs.getString("cType"));
			bag.setcDate(rs.getDate("cDate"));
			bag.setcDay(rs.getString("cDay"));
			bag.setcTime(rs.getTime("cTime"));
			bag.setcAddress(rs.getString("cAddress"));
			bag.setcInfo(rs.getString("cInfo"));
			bag.setcLimit(rs.getByte("cLimit"));
			bag.setcPrice(rs.getInt("cPrice"));
			bag.setcImg(rs.getString("cImg"));
			bag.settID(rs.getString("tID"));
			list.add(bag);
		}
		dbcp.freeConnection(con, ps, rs);
		return list;
	}
	*/
	
	// 카테고리별 강좌 목록
	public List<ClassVO> typeread(String find) throws Exception {
		con = dbcp.getConnection();

		String sql = "select * from class where cType like '" + find + "%'";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
		// 내용이 없을수도 많을수도 있다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공");
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
		List<ClassVO> list = new ArrayList<ClassVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			ClassVO bag = new ClassVO();
			// 가방에 넣기
			bag.setcCode(rs.getInt("cCode"));
			bag.setcTitle(rs.getString("cTitle"));
			bag.setcType(rs.getString("cType"));
			bag.setcDate(rs.getDate("cDate"));
			bag.setcDay(rs.getString("cDay"));
			bag.setcTime(rs.getTime("cTime"));
			bag.setcAddress(rs.getString("cAddress"));
			bag.setcInfo(rs.getString("cInfo"));
			bag.setcLimit(rs.getByte("cLimit"));
			bag.setcPrice(rs.getInt("cPrice"));
			bag.setcImg(rs.getString("cImg"));
			bag.settID(rs.getString("tID"));
			list.add(bag);
		}

		dbcp.freeConnection(con, ps, rs);

		return list;
	}

	// 전체 요일별, 시간별 강좌 목록
	public List<ClassVO> conditionread(String day, String time) throws Exception {
		con = dbcp.getConnection();

		String sql = "select * from class where cDay = ? and  cTime >= '"+ time +":00:00'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, day);


		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
		// 내용이 없을수도 많을수도 있다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공");
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
		List<ClassVO> list = new ArrayList<ClassVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			ClassVO bag = new ClassVO();
			// 가방에 넣기
			bag.setcCode(rs.getInt("cCode"));
			bag.setcTitle(rs.getString("cTitle"));
			bag.setcType(rs.getString("cType"));
			bag.setcDate(rs.getDate("cDate"));
			bag.setcDay(rs.getString("cDay"));
			bag.setcTime(rs.getTime("cTime"));
			bag.setcAddress(rs.getString("cAddress"));
			bag.setcInfo(rs.getString("cInfo"));
			bag.setcLimit(rs.getByte("cLimit"));
			bag.setcPrice(rs.getInt("cPrice"));
			bag.setcImg(rs.getString("cImg"));
			bag.settID(rs.getString("tID"));
			list.add(bag);
		}

		dbcp.freeConnection(con, ps, rs);

		return list;
	}
	
	// 카테고리별 요일, 시간 강좌 목록
	public List<ClassVO> conditionread(String find, String day, String time) throws Exception {
		con = dbcp.getConnection();
		
		String sql = "select * from class where cType like '" + find + "%' and cDay =? and cTime >= '"+ time +":00:00'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, day);

		System.out.println("3. sql문 생성 성공");
		// 4. sql문을 mysql로 전송
		// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
		// 내용이 없을수도 많을수도 있다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공");
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
		List<ClassVO> list = new ArrayList<ClassVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			ClassVO bag = new ClassVO();
			// 가방에 넣기
			bag.setcCode(rs.getInt("cCode"));
			bag.setcTitle(rs.getString("cTitle"));
			bag.setcType(rs.getString("cType"));
			bag.setcDate(rs.getDate("cDate"));
			bag.setcDay(rs.getString("cDay"));
			bag.setcTime(rs.getTime("cTime"));
			bag.setcAddress(rs.getString("cAddress"));
			bag.setcInfo(rs.getString("cInfo"));
			bag.setcLimit(rs.getByte("cLimit"));
			bag.setcPrice(rs.getInt("cPrice"));
			bag.setcImg(rs.getString("cImg"));
			bag.settID(rs.getString("tID"));
			list.add(bag);
		}
		
		dbcp.freeConnection(con, ps, rs);
		
		return list;
	}

	
	// 검색 목록
		public List<ClassVO> searchread(String find) throws Exception {
			con = dbcp.getConnection();
			
			String sql = "select * from class where cTitle like '%" + find + "%' or cType like '%" + find + 
					"%' or cDay like '%" + find + "%' or cAddress like '%" + find + "%' or cInfo like '%" + find + "%'";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 생성 성공");
			// 4. sql문을 mysql로 전송
			// select의 결과는 검색결과가 담긴 테이블이 온다.(항목+내용)
			// 내용이 없을수도 많을수도 있다.
			ResultSet rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			// 가방을 넣는 컨테이너 역할을 하게 됨.!
			// <>안에는 컨테이너에 무엇을 넣을지 지정!
			List<ClassVO> list = new ArrayList<ClassVO>();
			while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
				ClassVO bag = new ClassVO();
				// 가방에 넣기
				bag.setcCode(rs.getInt("cCode"));
				bag.setcTitle(rs.getString("cTitle"));
				bag.setcType(rs.getString("cType"));
				bag.setcDate(rs.getDate("cDate"));
				bag.setcDay(rs.getString("cDay"));
				bag.setcTime(rs.getTime("cTime"));
				bag.setcAddress(rs.getString("cAddress"));
				bag.setcInfo(rs.getString("cInfo"));
				bag.setcLimit(rs.getByte("cLimit"));
				bag.setcPrice(rs.getInt("cPrice"));
				bag.setcImg(rs.getString("cImg"));
				bag.settID(rs.getString("tID"));
				list.add(bag);
			}
			
			dbcp.freeConnection(con, ps, rs);
			
			return list;
		}
}