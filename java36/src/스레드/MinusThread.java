package 스레드;

public class MinusThread extends Thread {
	@Override
	public void run() {
		for (int i = 1000; i >0; i--) {
			//1000이 0보다 클동안, i>=1
			System.out.println("감소 : " + i);
		}
	}
}