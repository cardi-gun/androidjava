package DB연결하기;

import java.util.Date;

public class 반환값출력2 {

	public static void main(String[] args) {
		반환값연습 p = new 반환값연습();
		int r1 = p.add(4, 6);
		System.out.println(r1);
		double r2 = p.add(35.1, 5);
		System.out.println(r2);

		int[] r3 = p.add(9);
		for (int i : r3) {
			System.out.println(i);
		}
		Date r4 = p.add();
		System.out.println(r4.getDate());
		System.out.println(r4.getHours());
	
		boolean r5 = p.add(true);
		System.out.println(r5);
		
		String r6 = p.add("8월", 28);
		System.out.println(r6);
		
		}

}
