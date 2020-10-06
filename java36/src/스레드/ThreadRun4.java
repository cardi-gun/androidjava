package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadRun4 extends JFrame {
	// 전역변수, 글로벌 변수
	JLabel top = new JLabel("1");
	JLabel mid = new JLabel("2");
	JLabel bot = new JLabel("3");

	public ThreadRun4() {
		setSize(1000, 400);

		top.setFont(new Font("굴림", Font.PLAIN, 40));
		getContentPane().add(top, BorderLayout.NORTH);

		mid.setFont(new Font("굴림", Font.PLAIN, 40));
		getContentPane().add(mid, BorderLayout.CENTER);

		bot.setFont(new Font("굴림", Font.PLAIN, 40));
		getContentPane().add(bot, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(SystemColor.control);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(lblNewLabel, BorderLayout.WEST);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(SystemColor.control);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(lblNewLabel_1, BorderLayout.EAST);

		CounterThread2 counter = new CounterThread2();
		counter.start();
		TimerThread2 timer = new TimerThread2();
		timer.start();
		ImgThread2 img = new ImgThread2();
		img.start();
		setVisible(true);
	}

	// 내부클래스(inner class)
	// 변수를 다른 클래스와 공유해서 쓸수 있다.
	// 단점: 내부클래스는 독립적으로 사용 불가
	public class CounterThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				top.setText("카운터 : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}// run
	}// counter

	public class TimerThread2 extends Thread {
		// @ => Annotation(표시, 표기) : 기능없음, 지워도 무방
		// @Component => 기능있음 new!객체생성의 기능
		@Override // 오버라이트, 재정의
		public void run() {
			for (int i = 0; i < 300; i++) {
				Date date = new Date();
				bot.setText("타이머 : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}// run
	}// timer

	public class ImgThread2 extends Thread {
		@Override
		public void run() {
			String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < img.length; i++) {
				ImageIcon image = new ImageIcon(img[i]);
				mid.setIcon(image);
				mid.setText("");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}//run
	}//img

	public static void main(String[] args) {
		ThreadRun4 t = new ThreadRun4();

	}

}