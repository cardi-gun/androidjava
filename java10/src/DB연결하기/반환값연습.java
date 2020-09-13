package DB연결하기;

import java.util.Date;
import java.util.Random;

public class 반환값연습 {
	//하나의이름으로 다양한 형태의 메서드를 만들수 있는 기능 = 오버로딩=다형성
	public int add(int x, int y) {
		return x + y;
	}
	
	public double add(double x, int y) {
		return x + y;
	}
	
	public int[] add(int x) {//참조형이기때문에 주소가 넘어간다.
		int[] num = {1,2,x};
		return num;
	}
	
	public String add(String x, int y) {
		return x + y;
	}
	
	public Date add() {//참조형이기때문에 주소가 넘어간다.
		Date date = new Date();
		return date;
	}
	
	public boolean add(boolean x) {
		Random rand = new Random();
		return rand.nextBoolean() ;
	}
}
