package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의윈도우2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fra = new JFrame();
		fra.setSize(600,600);
		
		JButton btnNewButton = new JButton("버튼을 누르십쇼");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fra, "누르라고 누릅니까?");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 60));
		btnNewButton.setBackground(Color.MAGENTA);
		fra.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("왼쪽버튼");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fra, "왼쪽버튼입니다.");

			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		fra.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("오른쪽버튼");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fra, "오른쪽버튼입니다.");

			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 20));
		fra.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("상단버튼");
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fra, "상단버튼입니다.");

			}
		});
		fra.getContentPane().add(btnNewButton_3, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("하단버튼");
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fra, "하단버튼입니다.");

			}
		});
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 20));
		fra.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		fra.setVisible(true);
	}

}
