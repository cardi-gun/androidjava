package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 나의그래픽 {

	public static void main(String[] args) {
		//자바는 부품조립식 코드 => 객체지향형 프로그래밍(OOP)
		//ctrl + shift + o :자동 import
		// new는 복사의 의미, jframe을 복사해서 가져와라 
		JFrame fr = new JFrame();
		//new로 만들기 
		JButton btn1 = new JButton();
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//처리할내용 기술
				JOptionPane.showMessageDialog(fr, "눌러 보시겠어요?를 눌렀군요!");
			}
		});
		JButton btn2 = new JButton();
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "이것도 눌러봐요!를 눌렀군요!");

			}
		});
		JButton btn3 = new JButton();
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "그림을 눌렀군요!");
			}
		});
		//String img = "sky.png"
		ImageIcon img = new ImageIcon("sky.png");
		
		btn1.setText("눌러 보시겠어요?");
		btn2.setText("이것도 눌러봐요!");
		btn3.setIcon(img);//btn3에 이미지를 넣는다
		//fr에 btn들을 집어넣는다.
		fr.getContentPane().add(btn1);
		fr.getContentPane().add(btn2);
		fr.getContentPane().add(btn3);
		
		fr.setSize(700,500);	
		FlowLayout flow = new FlowLayout();
		//레이아웃 정렬방식
		fr.getContentPane().setLayout(flow);
		//프레임을 가시적으로 바꿔줘야한다, 또한 맨 아래에 둬야한다. 중간에  넣으면 위의 줄만 보이고 아랫줄은 안보임
		fr.setVisible(true);
		
		
		
		
		
		
		
	}//main

}//class
