package DB연결하기;

public class 반환값출력 {

	public static void main(String[] args) {
		String data = "나는 진짜 자바 프로그래머";
		String[] dataset = data.split(" ");// 자르기 명령어
		System.out.println(dataset.length);
		for (String string : dataset) {
			System.out.println(string);
		}
		System.out.println("------------------------------");

		String data2 = "010-2265-3963";
		String[] dataset2 = data2.split("-");
		System.out.println(dataset2.length);
		for (String string : dataset2) {
			System.out.println(string);
		}
		System.out.println("------------------------------");

		String data3 = "A1가";// 문자열에 들어있는 문자 하나하나가 의미를 가지고있을때
		char[] dataset3 = data3.toCharArray();// 문자열을 하나씩 잘라낸다.
		System.out.println(dataset3.length);
		for (char c : dataset3) {
			System.out.println(c);
		}

	}

}
