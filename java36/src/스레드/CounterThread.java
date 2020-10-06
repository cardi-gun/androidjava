package 스레드;

public class CounterThread extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0 ; i--) {
			System.out.println("카운터 : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}//run

//	public void view() {
//		super.run();//현재 만들 run을 호출하는게 아닌 부모클래스의 run을 사용하게 된다.
//		//super = 부모 / this = 현재 클래스
//		System.out.println("내용을 프린트");
//	}
	
}//class
