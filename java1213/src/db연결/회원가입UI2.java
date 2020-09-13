package db연결;

import javax.swing.JOptionPane;

public class 회원가입UI2 {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("id입력");
		String pw = JOptionPane.showInputDialog("pw입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		MemberVO bag = new MemberVO();//가방을 만든다.
		bag.setId(id);//set메서드를 ㄷ통해서 가방에 각 값들을 하나씩 넣는다.
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		MemberDAO dao = new MemberDAO();
		dao.create(bag);
	}
}
