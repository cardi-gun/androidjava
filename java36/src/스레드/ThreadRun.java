package 스레드;

public class ThreadRun {
	
	public static void main(String[] args) {
		StarThread star = new StarThread();
		CircleThread circle = new CircleThread();
		//star.run();
		//circle.run();
		//직접호출하게 되면 순차적으로 CPU가 동작하다
		star.start();
		circle.start();
		//start메서드를 사용해주면 main과 같이 동시에 돌리게 된다.
		//cpu의 상황에 따라 다르게 동작한다. 
		//main과 star,circle 총 3개가 같이 돌고있다.
	}
}
