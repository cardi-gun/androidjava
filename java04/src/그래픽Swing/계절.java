package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계절 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame season = new JFrame();
		
		JButton spring = new JButton();
		spring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(season, "선선해요.");
			}
		});
		spring.setBackground(Color.YELLOW);
		spring.setForeground(Color.BLUE);
		spring.setFont(new Font("굴림", Font.PLAIN, 60));
		
		
		JButton summer = new JButton();
		summer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(season, "더워요.");
			}
		});
		summer.setForeground(Color.GREEN);
		summer.setBackground(Color.PINK);
		summer.setFont(new Font("굴림", Font.PLAIN, 60));
//		JButton autom = new JButton();
//		JButton summer = new JButton();
		
		spring.setText("봄");
		summer.setText("여름");
		
		season.getContentPane().add(spring);
		season.getContentPane().add(summer);
		season.setSize(200, 250);//jframe 사이즈 정리

		FlowLayout flow = new FlowLayout();//플로우 레이아웃에서는 글자 크기에 따라 자동조절
		season.getContentPane().setLayout(flow);

		
		season.setVisible(true);
		
		
	}

}
