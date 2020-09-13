package db연결;

import javax.swing.JOptionPane;

public class 회원정보수정UI {

	public static void main(String[] args) throws Exception {
		MemberDAO db = new MemberDAO();
		
		String id = JOptionPane.showInputDialog("겁색할 id입력");
		String tel = JOptionPane.showInputDialog("수정할 tel입력");

		db.update(tel, id);
	}

}
