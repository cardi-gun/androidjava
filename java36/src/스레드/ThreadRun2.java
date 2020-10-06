package 스레드;

public class ThreadRun2 {
	public static void main(String[] args) {
		PlusThread plus = new PlusThread();
		MinusThread minus = new MinusThread();
		
		plus.start();
		minus.start();
		//실제로 동시에 실행되는것이 아니라
		//plus조금 minus조금씩 동작을 실행하고있어
		//사람이 볼때는 동시에 움직이는것 처럼 보인다.
		
	}
}