package db연결;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class BbsCrudUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(1500, 1000);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("NO");
		l1.setFont(new Font("굴림", Font.PLAIN, 40));
		l1.setBounds(20, 20, 100, 50);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("TITLE");
		l2.setFont(new Font("굴림", Font.PLAIN, 40));
		l2.setBounds(160, 20, 160, 50);
		f.getContentPane().add(l2);

		JLabel l3 = new JLabel("CONTENT");
		l3.setFont(new Font("굴림", Font.PLAIN, 40));
		l3.setBounds(20, 170, 200, 50);
		f.getContentPane().add(l3);

		JLabel l4 = new JLabel("WRITER");
		l4.setFont(new Font("굴림", Font.PLAIN, 40));
		l4.setBounds(500, 20, 160, 50);
		f.getContentPane().add(l4);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 40));
		t1.setBounds(20, 80, 100, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 40));
		t2.setColumns(10);
		t2.setBounds(160, 80, 300, 50);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 40));
		t3.setColumns(10);
		t3.setBounds(20, 230, 600, 300);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 40));
		t4.setColumns(10);
		t4.setBounds(500, 80, 150, 50);
		f.getContentPane().add(t4);

		TextArea t5 = new TextArea();
		t5.setFont(new Font("Dialog", Font.PLAIN, 40));
		t5.setBounds(700, 20, 700, 800);
		t5.setColumns(10);
		f.getContentPane().add(t5);

		JButton create = new JButton("Create");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				String title = t1.getText();
				String content = t3.getText();
				String writer = t4.getText();

				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();

				bag.setNo(Integer.parseInt(no));
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

					try {
						dao.create(bag);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

			}
		});
		create.setFont(new Font("굴림", Font.PLAIN, 40));
		create.setBounds(50, 650, 200, 50);
		f.getContentPane().add(create);

		JButton One = new JButton("One");
		One.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				BbsDAO dao = new BbsDAO();
				try {
					BbsVO bag = dao.one(Integer.parseInt(no));
					t1.setText(String.valueOf(bag.getNo()));
					t2.setText(bag.getTitle());
					t3.setText(bag.getContent());
					t4.setText(bag.getWriter());

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		One.setFont(new Font("굴림", Font.PLAIN, 40));
		One.setBounds(400, 650, 200, 50);
		f.getContentPane().add(One);

		JButton Update = new JButton("Update");
		Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				String content = t3.getText();
				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();
				bag.setNo(Integer.parseInt(no));
				bag.setContent(content);
				try {
					dao.update(bag);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		Update.setFont(new Font("굴림", Font.PLAIN, 40));
		Update.setBounds(50, 750, 200, 50);
		f.getContentPane().add(Update);

		JButton Delete = new JButton("Delete");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();
				bag.setNo(Integer.parseInt(no));
				try {
					dao.delete(bag);
					// BbsVO bag = dao.delete(Integer.parseInt(no));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		Delete.setFont(new Font("굴림", Font.PLAIN, 40));
		Delete.setBounds(400, 750, 200, 50);
		f.getContentPane().add(Delete);

		JButton all = new JButton("ALL");
		all.setFont(new Font("굴림", Font.PLAIN, 40));
		all.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					BbsDAO dao = new BbsDAO();
					ArrayList<BbsVO> list = dao.all();
					System.out.println("게시판 개수 : " + list.size() + "개");
					// System.out.println("NO" + "\t" + "TITLE" + "\t" + "CONTENT" + "\t" +
					// "WRITER");
					for (int i = 0; i < list.size(); i++) {
						// list에 들어있는 가방을 하나씩 가져온다.
						BbsVO bag = list.get(i);
//						System.out.println(
//								bag.getNo() + "\t" + bag.getTitle() + "\t" + bag.getContent() + "\t" + bag.getWriter());
//						System.out.println("");
						t5.append(bag.getNo() + ", " + bag.getTitle() + ", " + bag.getContent() + ", " + bag.getWriter()
								+ "\n");
					}
				} catch (Exception e2) {
				}
			}
		});
		all.setBounds(50, 550, 200, 50);
		f.getContentPane().add(all);

		f.setVisible(true);

	}// main
}
