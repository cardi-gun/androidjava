package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class 대소계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프레임,라벨3,입력2,버튼1
		JFrame f = new JFrame();
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.BOLD, 40));
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.BOLD, 40));
		JLabel result = new JLabel();
		result.setFont(new Font("굴림", Font.BOLD, 40));
		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.PLAIN, 40));
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.PLAIN, 40));
		JButton btn1 = new JButton();
		btn1.setFont(new Font("굴림", Font.BOLD, 40));
			btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tt1 = t1.getText();// 입력한 값 변수에 가져오기
				String tt2 = t2.getText();
				// 산술연산하기 위해 형 변환
				int i1 = Integer.parseInt(tt1);
				int i2 = Integer.parseInt(tt2);
				int sum;
				if (i1 > i2) {
					sum = i1;
				} else {
					sum = i2;
				}
				// 처리한 결과를 사용자에게 보여줌. 출력
				// 정수형 결과값을 문자열로 바꾼다/정석 변환.
				String sum2 = String.valueOf(sum);
				result.setText(sum2+"이 더 큽니다.");
			}
		});
				
				
		l1.setText("숫자1");
		l2.setText("숫자2");
		btn1.setText("대소비교");
		
		FlowLayout flow = new FlowLayout();
		
		//프레임정리
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
