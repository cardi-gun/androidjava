package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 출생년도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프레임
		JFrame f = new JFrame();

		// 라벨2
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.BOLD, 40));
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.BOLD, 40));
		JLabel result = new JLabel();
		result.setFont(new Font("굴림", Font.PLAIN, 30));
		// 텍스트필드2
		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.PLAIN, 40));
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.PLAIN, 40));
		// 버튼1
		JButton btn1 = new JButton();
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s2);
				String adult;
				if ((2020 - i1) >= 18) {
					adult = "성인";
				} else {
					adult = "미성년자";
				}
				result.setText(s1 + "는 " + adult + "입니다.");
			}
		});
		btn1.setFont(new Font("굴림", Font.PLAIN, 40));
		// 레이아웃
		FlowLayout flow = new FlowLayout();

		l1.setText("이름");
		l2.setText("출생년도");
		btn1.setText("결과");

		// 프레임 설정
		f.setSize(400, 700);
		f.getContentPane().setLayout(flow);

		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(btn1);
		f.getContentPane().add(result);

		f.setVisible(true);

	}

}
