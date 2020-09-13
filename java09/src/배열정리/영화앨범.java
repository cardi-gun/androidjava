package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범 {
	static int now = 2;// 현재 위치를 체크할수 있는 변수
	// 인터페이스에서 사용되어야 하기때문에 main밖에서 사용된다. static에서 사용하기위해 static을 쓴다.

	public static void main(String[] args) {

		// 영화제목목록, 이미지 목록, 감독목록, 평점목록
		String[] titles = { "오케이 마담", "다만 악에서 구하소서", "테넷", "강철비2:정상회담", "반도" };
		String[] images = { "오케이.png", "다만악.png", "테넷.png", "강철비2.png", "반도.png" };
		String[] directors = { "이철하", "홍원찬", "크리스토퍼 놀란", "양우석", "연상호" };
		double[] rates = { 8.12, 8.60, 9.07, 8.02, 7.25 };

		JFrame f = new JFrame();
		f.setTitle("나의 영화앨범");
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);

		JLabel title = new JLabel(titles[2]);
		title.setFont(new Font("굴림", Font.BOLD, 48));
		title.setBounds(109, 49, 566, 80);
		f.getContentPane().add(title);

		JLabel img = new JLabel("New label");
		img.setIcon(new ImageIcon(images[2]));
		img.setBounds(161, 150, 201, 292);
		f.getContentPane().add(img);

		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setBounds(408, 126, 217, 53);
		f.getContentPane().add(lblNewLabel_2);

		JLabel director = new JLabel(directors[2]);
		director.setForeground(Color.RED);
		director.setFont(new Font("굴림", Font.PLAIN, 24));
		director.setBounds(425, 169, 219, 53);
		f.getContentPane().add(director);

		JLabel lblNewLabel_2_1 = new JLabel("평점");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2_1.setBounds(408, 254, 217, 53);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel rate = new JLabel(rates[2] + "");// 더블값을 스트링으로 변환시켜주기위해 +"" 을 붙여 스트링화 한다!
		rate.setForeground(Color.RED);
		rate.setFont(new Font("굴림", Font.PLAIN, 24));
		rate.setBounds(425, 296, 219, 53);
		f.getContentPane().add(rate);

		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 현재 인덱스를 체크한다.
				if (now == 0) {
					now = 5;
				}
				now--;// now에 -1을 해서 다른 배열의 값을 처리 해준다
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now] + "");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton.setBounds(0, 0, 97, 561);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//다른방식
				if (now >= 4) {
					now = 0;
				} else {
					now++;// 3
				}
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now] + "");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton_1.setBounds(687, 0, 97, 561);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
