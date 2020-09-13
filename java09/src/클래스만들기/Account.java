package 클래스만들기;

public class Account {
	// 멤버 변수 생성
	String name;
	String bank;
	int amount;

	// 멤버 메서드 생성
	public void deposit(String s, int name) {
		// String으로 받아 누가 int 만큼 출력하는지.
		System.out.println(s + "가 " + name + "원을 입금했습니다.");
	}

	public void withdraw(int a) {
		// this를 사용해 사용하는 인스턴스가 알아서 누구인지 출력
		System.out.println(this.name + "가 " + a + "원을 출금했습니다.");
	}

	public void deposit2() {
		// 알아서 누가 얼마를 입금했는지 출력.
		System.out.println(this.name + "가 " + amount + "원을 입금했습니다.");
	}
	
}
