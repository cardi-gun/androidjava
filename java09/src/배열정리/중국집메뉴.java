package 배열정리;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 중국집메뉴 {
	static int count = 0;

	public static void main(String[] args) {
		String[] images = { "짜장.png", "짬뽕.png", "우동.png" };// 각 이미지 저장

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

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\hee\\workspace\\java09\\메뉴.png"));
		img.setBounds(73, 84, 458, 419);
		f.getContentPane().add(img);
		f.setVisible(true);

		JButton jjajang = new JButton("짜장");
		jjajang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				counts.setText(count + "개");
				ImageIcon icon = new ImageIcon(images[0]);
				img.setIcon(icon);
				total.setText((count * 5000) + "원 입니다.");
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
				ImageIcon icon = new ImageIcon(images[1]);
				img.setIcon(icon);
				total.setText((count * 5000) + "원 입니다.");
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
				ImageIcon icon = new ImageIcon(images[2]);
				img.setIcon(icon);
				total.setText((count * 5000) + "원 입니다.");
			}
		});
		uodong.setFont(new Font("굴림", Font.PLAIN, 30));
		uodong.setBounds(272, 10, 118, 43);
		f.getContentPane().add(uodong);

	}
}
