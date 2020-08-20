package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의윈도우 {

	public static void main(String[] args) {
		// 틀역할을 하는 부품이 필요
		JFrame f = new JFrame();// c드라이브에서 new로 복사해서 RAM에 저장
		f.setSize(500, 500);// 사이즈
		
		JButton btnNewButton = new JButton("나를 눌러요");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "눌러주셨군요!");
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true); // 기본적으로 보이지 않는 형태여서 true로 바꿔줘야한다.
	}

}
