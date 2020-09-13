package DB연결하기;

import javax.swing.JOptionPane;

public class DB입력게시판UI {
	//auto-increment
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String id = null;
		String pw = JOptionPane.showInputDialog("pw입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		DB처리게시판전담 db = new DB처리게시판전담();
		db.create(pw, name, tel);
	}

}
