package 연산자;

public class 논리연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hot = 25;
		int wind = 100;
		
		//hot이 30도 이상이거나 wind가 88이하면 양산을 챙긴다.
		if(hot >= 30 || wind<=88) {
			System.out.println("양산을 가져간다.");
		}else {
			System.out.println("양산을 놓고간다.");

		}
		
		
	}

}
