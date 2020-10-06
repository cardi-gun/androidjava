package 스레드;

//import java.lang.*;

public class StarThread extends Thread {
	//스레드로 사용하는 멤버 변수, 멤버 메서드가 내장되어있다.
	@Override
	public void run() {
		//안에 있는 내용을 동시에 처리
		for (int i = 0; i < 1000; i++) {
			System.out.println("★");
		}
		//super.run();
		//Thread안에 있는 내용이 돈다
	}
}