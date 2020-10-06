package 형변환casting;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 마이윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		JButton b = new JButton("버튼입니다.");
		JLabel l = new JLabel("라벨입니다.");
		JPanel p = new JPanel();
		p.setBackground(Color.yellow);
		f.setLayout(new FlowLayout());
		f.add(p);
		f.add(l);
		f.add(b);
		
		Font font = new Font("궁서",Font.BOLD,16);
		b.setFont(font);
		l.setFont(font);
		f.setVisible(true);
		
	}

}
