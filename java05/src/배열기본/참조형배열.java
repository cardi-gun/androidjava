package 배열기본;

public class 참조형배열 {

	public static void main(String[] args) {
		// 참조형 배열

		String names[] = new String[2];
		names[0] = "홍길동";
		names[2] = "김길동";
		System.out.println("개수: " + names.length);
		// names,names[0],names[1],홍,길,동,김,길,동,names.length = 총 10개

	}

}
