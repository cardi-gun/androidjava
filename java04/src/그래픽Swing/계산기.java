package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프레임
		JFrame calcul = new JFrame();
		calcul.getContentPane().setBackground(SystemColor.activeCaption);
		calcul.getContentPane().setForeground(Color.WHITE);
		// 이미지
		ImageIcon img = new ImageIcon("cal.png");
		// 라벨
		JLabel jlcal = new JLabel();
		JLabel jl1 = new JLabel();
		jl1.setFont(new Font("굴림", Font.BOLD, 40));
		JLabel jl2 = new JLabel();
		jl2.setFont(new Font("굴림", Font.BOLD, 40));
		JLabel jresult = new JLabel();
		jresult.setForeground(Color.RED);
		jresult.setBackground(Color.ORANGE);
		jresult.setFont(new Font("굴림", Font.BOLD, 40));
		// 텍스트 입력칸
		JTextField jtext1 = new JTextField(10);
		jtext1.setForeground(Color.BLUE);
		jtext1.setFont(new Font("굴림", Font.PLAIN, 40));
		jtext1.setBackground(Color.ORANGE);
		JTextField jtext2 = new JTextField(10);
		jtext2.setForeground(Color.BLUE);
		jtext2.setFont(new Font("굴림", Font.PLAIN, 40));
		jtext2.setBackground(Color.ORANGE);
		// 버튼
		JButton plus = new JButton();
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// text1과 text2의 입력한 값을 가지고 올 것,
				// 가지온 값의 데이터 타입은 무조건 String!
				String t1 = jtext1.getText();// 입력한 값 변수에 가져오기
				String t2 = jtext2.getText();
				// 산술연산하기 위해 형 변환
				int intt1 = Integer.parseInt(t1);
				int intt2 = Integer.parseInt(t2);
				int sum = intt1 + intt2;
				// 처리한 결과를 사용자에게 보여줌. 출력
				// 정수형 결과값을 문자열로 바꾼다/정석 변환.
				String sum2 = String.valueOf(sum);
				jresult.setText(sum2);
				// jresult.setText(sum + "");//편법으로 기본데이터와 문자열이 합쳐지면 전부다 문자열 처리.
			}
		});
		plus.setFont(new Font("굴림", Font.PLAIN, 50));
		plus.setForeground(Color.RED);
		plus.setText("+");
		plus.setBackground(Color.BLUE);

		JButton plus_1 = new JButton();
		plus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1 = jtext1.getText();// 입력한 값 변수에 가져오기
				String t2 = jtext2.getText();
				// 산술연산하기 위해 형 변환
				int intt1 = Integer.parseInt(t1);
				int intt2 = Integer.parseInt(t2);
				int sum = intt1 - intt2;
				// 처리한 결과를 사용자에게 보여줌. 출력
				// 정수형 결과값을 문자열로 바꾼다/정석 변환.
				String sum2 = String.valueOf(sum);
				jresult.setText(sum2);
			}
		});
		plus_1.setText("-");
		plus_1.setForeground(Color.RED);
		plus_1.setFont(new Font("굴림", Font.PLAIN, 50));
		plus_1.setBackground(Color.BLUE);

		JButton plus_1_1 = new JButton();
		plus_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1 = jtext1.getText();// 입력한 값 변수에 가져오기
				String t2 = jtext2.getText();
				// 산술연산하기 위해 형 변환
				int intt1 = Integer.parseInt(t1);
				int intt2 = Integer.parseInt(t2);
				int sum = intt1 * intt2;
				// 처리한 결과를 사용자에게 보여줌. 출력
				// 정수형 결과값을 문자열로 바꾼다/정석 변환.
				String sum2 = String.valueOf(sum);
				jresult.setText(sum2);
			}
		});
		plus_1_1.setText("*");
		plus_1_1.setForeground(Color.RED);
		plus_1_1.setFont(new Font("굴림", Font.PLAIN, 50));
		plus_1_1.setBackground(Color.BLUE);

		JButton plus_1_1_1 = new JButton();
		plus_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1 = jtext1.getText();// 입력한 값 변수에 가져오기
				String t2 = jtext2.getText();
				// 산술연산하기 위해 형 변환
				int intt1 = Integer.parseInt(t1);
				int intt2 = Integer.parseInt(t2);
				int sum = intt1 / intt2;
				// 처리한 결과를 사용자에게 보여줌. 출력
				// 정수형 결과값을 문자열로 바꾼다/정석 변환.
				String sum2 = String.valueOf(sum);
				jresult.setText(sum2);
			}
		});
		plus_1_1_1.setText("/");
		plus_1_1_1.setForeground(Color.RED);
		plus_1_1_1.setFont(new Font("굴림", Font.PLAIN, 50));
		plus_1_1_1.setBackground(Color.BLUE);

		JButton plus_2 = new JButton();
		plus_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1 = jtext1.getText();// 입력한 값 변수에 가져오기
				String t2 = jtext2.getText();
				// 산술연산하기 위해 형 변환
				int intt1 = Integer.parseInt(t1);
				int intt2 = Integer.parseInt(t2);
				int sum;
				if (intt1 > intt2) {
					sum = intt1;
				} else {
					sum = intt2;
				}
				// 처리한 결과를 사용자에게 보여줌. 출력
				// 정수형 결과값을 문자열로 바꾼다/정석 변환.
				String sum2 = String.valueOf(sum);
				jresult.setText(sum2);
			}
		});
		plus_2.setText("><");
		plus_2.setForeground(Color.RED);
		plus_2.setFont(new Font("굴림", Font.PLAIN, 50));
		plus_2.setBackground(Color.BLUE);

		// 레이아웃
		FlowLayout flow = new FlowLayout();
		// 프레임 조정
		calcul.setSize(400, 700);
		calcul.getContentPane().setLayout(flow);
		jlcal.setIcon(img);// 라벨에 이미지 삽입
		jl1.setText("숫자1");
		jl2.setText("숫자2");
		// 각 부품을 프레임에 정리, 순서대로 붙일것.
		calcul.getContentPane().add(jlcal);
		calcul.getContentPane().add(jl1);
		calcul.getContentPane().add(jtext1);
		calcul.getContentPane().add(jl2);
		calcul.getContentPane().add(jtext2);
		calcul.getContentPane().add(plus);
		calcul.getContentPane().add(plus_1);
		calcul.getContentPane().add(plus_1_1);
		calcul.getContentPane().add(plus_1_1_1);

		calcul.getContentPane().add(plus_2);
		calcul.getContentPane().add(jresult);

		calcul.setVisible(true);
	}

}
