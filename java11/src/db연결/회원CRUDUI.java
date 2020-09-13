package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel.setBounds(50, 50, 100, 40);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.BOLD, 50));
		lblPw.setBounds(50, 150, 100, 40);
		f.getContentPane().add(lblPw);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("굴림", Font.BOLD, 50));
		lblName.setBounds(50, 250, 160, 40);
		f.getContentPane().add(lblName);
		
		JLabel lblPw_1_1 = new JLabel("TEL");
		lblPw_1_1.setFont(new Font("굴림", Font.BOLD, 50));
		lblPw_1_1.setBounds(50, 350, 100, 40);
		f.getContentPane().add(lblPw_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 40));
		t1.setBounds(250, 50, 200, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 40));
		t2.setColumns(10);
		t2.setBounds(250, 150, 200, 40);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 40));
		t3.setColumns(10);
		t3.setBounds(250, 250, 200, 40);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 40));
		t4.setColumns(10);
		t4.setBounds(250, 350, 200, 40);
		f.getContentPane().add(t4);
		
		
		
		
		
		JButton create = new JButton("CREATE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//회원가입할 정보 4개의 입력값을 가지고 와서 db처리
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id, pw, name, tel);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		create.setFont(new Font("굴림", Font.PLAIN, 30));
		create.setBounds(14, 450, 200, 75);
		f.getContentPane().add(create);
		
		JButton read = new JButton("READ");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
					int result = dao.read(id);
					if(result ==1) {// 검색결과가 있음
						
					}else { //검색결과가 없음.
						t1.setText("없음");
						t2.setText("없음");
						t3.setText("없음");
						t4.setText("없음");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		read.setFont(new Font("굴림", Font.PLAIN, 30));
		read.setBounds(268, 450, 200, 75);
		f.getContentPane().add(read);
		
		JButton update = new JButton("UPDATE");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.update(tel, id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		update.setFont(new Font("굴림", Font.PLAIN, 30));
		update.setBounds(14, 550, 200, 75);
		f.getContentPane().add(update);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
					dao.delete(id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		delete.setFont(new Font("굴림", Font.PLAIN, 30));
		delete.setBounds(268, 550, 200, 75);
		f.getContentPane().add(delete);
		
		
		
		
		f.setVisible(true);
	}
}
