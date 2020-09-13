package 클래스만들기;
//class=같은 성격을 가진 group, 부류
//tv부류가 일반적으로 가져야하는 기능을 정의.
public class 텔레비젼 {
	// 화면 on/off
	// 화면출력
	// 신호입력
	// 함수의 정의=>메서드(method, 방법을 정의)
	public void on() {
		System.out.println("콘센트에 전원을 연결한다.");
		System.out.println("전원을 킨다.");
	}

	public void off() {
		System.out.println("전원을 끈다.");
		System.out.println("콘센트를 전원을 해제한다.");
	}

	public void output() {
		System.out.println("화면을 출력한다.");
	}

	public void input() {
		System.out.println("리모콘에서 나오는 신호를 입력받는다.");
	}
}
