package 연산자;

import javax.swing.JOptionPane;

public class 조건문예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.입력
		String food = JOptionPane.showInputDialog("먹고싶은 음식은?(아이스크림, 아이스커피...");
		
		//2.처리
		String result = "";
		if (food.equals("아이스크림")) {
			result = "뚜레주르로 가요";
		}else if (food.equals("아이스커피")) {
			result = "이디야로 가요";
		}else {
			result = "물이나 드십쇼";
		}
		
		//3. 출력
		System.out.println(result);
		
	}

}
