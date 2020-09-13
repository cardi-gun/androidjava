package 클래스만들기;

public class FamAccount {

	public static void main(String[] args) {
		// 각 계좌 생성
		Account a1 = new Account();
		a1.name = "김아빠";
		a1.bank = "하나적금";
		a1.amount = 10000;

		Account a2 = new Account();
		a2.name = "이엄마";
		a2.bank = "하나예금";
		a2.amount = 6000;

		Account a3 = new Account();
		a3.name = "김아들";
		a3.bank = "신한예금";
		a3.amount = 3000;

		System.out.println("이름 \t 계좌이름 \t 금액");
		System.out.println("------------------------------");
		System.out.println(a1.name + "\t" + a1.bank + "\t" + a1.amount);
		System.out.println(a2.name + "\t" + a2.bank + "\t" + a2.amount);
		System.out.println(a3.name + "\t" + a3.bank + "\t" + a3.amount);
		// class 멤버 변수 출력

		// class 멤버 메서드 출력
		a1.deposit(a1.name, a1.amount);
		a3.withdraw(a3.amount);
		a2.deposit2();
		
		int[] inta = new int[10];
		System.out.println(inta[4]);
	}

}
