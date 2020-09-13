package 배열정리;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 중국집메뉴2 {
	static int count = 0;// 총개수 저장 변수
	static int countjja = 0; // 짜장개수
	static int countjjam = 0;// 짬뽕개수
	static int countuo = 0; // 우동개수
	static int totalpay = 0;// 총 금액

	public static void main(String[] args) {
		// 각 이미지 저장 배열 선언
		String[] images = { "짜장.png", "짬뽕.png", "우동.png" };

		JFrame f = new JFrame();

		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("총 개수");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(462, 10, 118, 43);
		f.getContentPane().add(lblNewLabel);

		JLabel counts = new JLabel("0개");
		counts.setForeground(Color.BLACK);
		counts.setBackground(new Color(255, 255, 255));
		counts.setFont(new Font("굴림", Font.BOLD, 30));
		counts.setBounds(592, 10, 247, 43);
		f.getContentPane().add(counts);

		JLabel lblNewLabel_2 = new JLabel("지불할금액");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setBounds(73, 513, 160, 43);
		f.getContentPane().add(lblNewLabel_2);

		JLabel total = new JLabel("0원 입니다.");
		total.setForeground(Color.BLACK);
		total.setFont(new Font("굴림", Font.BOLD, 30));
		total.setBackground(Color.WHITE);
		total.setBounds(245, 513, 247, 43);
		f.getContentPane().add(total);

		JLabel lblNewLabel_1 = new JLabel("짜장");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(462, 84, 88, 43);
		f.getContentPane().add(lblNewLabel_1);

		JLabel countsjja = new JLabel("0개");
		countsjja.setForeground(Color.BLACK);
		countsjja.setFont(new Font("굴림", Font.BOLD, 30));
		countsjja.setBackground(Color.WHITE);
		countsjja.setBounds(543, 84, 247, 43);
		f.getContentPane().add(countsjja);

		JLabel lblNewLabel_1_1 = new JLabel("짬뽕");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(462, 137, 88, 43);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel countsjjam = new JLabel("0개");
		countsjjam.setForeground(Color.BLACK);
		countsjjam.setFont(new Font("굴림", Font.BOLD, 30));
		countsjjam.setBackground(Color.WHITE);
		countsjjam.setBounds(543, 137, 247, 43);
		f.getContentPane().add(countsjjam);

		JLabel lblNewLabel_1_2 = new JLabel("우동");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(462, 190, 88, 43);
		f.getContentPane().add(lblNewLabel_1_2);

		JLabel countsuo = new JLabel("0개");
		countsuo.setForeground(Color.BLACK);
		countsuo.setFont(new Font("굴림", Font.BOLD, 30));
		countsuo.setBackground(Color.WHITE);
		countsuo.setBounds(543, 190, 247, 43);
		f.getContentPane().add(countsuo);

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\hee\\workspace\\java09\\메뉴.png"));// 초기이미지, 메뉴판
		img.setBounds(73, 84, 388, 419);
		f.getContentPane().add(img);
		f.setVisible(true);

		JButton jjajang = new JButton("짜장");
		jjajang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; // 총개수 +1
				counts.setText(count + "개");
				countjja++; // 개별 가격 +1
				countsjja.setText(countjja + "개");
				ImageIcon icon = new ImageIcon(images[0]); // 짜장이미지
				img.setIcon(icon);// 이미지에 아이콘을 넣을수 있게
				totalpay = totalpay + 5000; // 짜장가격 추가
				total.setText(totalpay + "원 입니다."); // string출력
			}
		});
		jjajang.setFont(new Font("굴림", Font.PLAIN, 30));
		jjajang.setBounds(12, 10, 118, 43);
		f.getContentPane().add(jjajang);

		JButton jjambbong = new JButton("짬뽕");
		jjambbong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				counts.setText(count + "개");
				countjjam++;
				countsjjam.setText(countjjam + "개");
				ImageIcon icon = new ImageIcon(images[1]);
				img.setIcon(icon);
				totalpay = totalpay + 4000;
				total.setText(totalpay + "원 입니다.");
			}
		});
		jjambbong.setFont(new Font("굴림", Font.PLAIN, 30));
		jjambbong.setBounds(142, 10, 118, 43);
		f.getContentPane().add(jjambbong);

		JButton uodong = new JButton("우동");
		uodong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				counts.setText(count + "개");
				countuo++;
				countsuo.setText(countuo + "개");
				ImageIcon icon = new ImageIcon(images[2]);
				img.setIcon(icon);
				totalpay = totalpay + 4500;
				total.setText(totalpay + "원 입니다.");
			}
		});
		uodong.setFont(new Font("굴림", Font.PLAIN, 30));
		uodong.setBounds(272, 10, 118, 43);
		f.getContentPane().add(uodong);

	}
}
