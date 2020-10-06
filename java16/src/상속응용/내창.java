package 상속응용;

import javax.swing.JFrame;

public class 내창 extends JFrame{//jframe을 상속받아 내가 원하는 창으로 만든다.
	String title;
	public 내창(String title) {
		//new 할때마다 title을 적어주도록 생성자를 만듬
		this.title = title;
	}

}
