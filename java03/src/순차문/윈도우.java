package 순차문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame name = new JFrame();
		name.setSize(650, 500);
		name.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("윈도우 열기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				윈도우2 name = new 윈도우2();
				name.main();
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 70));
		btnNewButton.setBounds(81, 57, 446, 130);
		name.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("윈도우 열기");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 70));
		btnNewButton_1.setBounds(81, 226, 446, 130);
		name.getContentPane().add(btnNewButton_1);
		name.setVisible(true);

	}
}
