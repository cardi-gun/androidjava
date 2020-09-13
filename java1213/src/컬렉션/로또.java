package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또 {

	public static void main(String[] args) {
		//랜덤숫자 메소드 생성
		Random r = new Random();
		HashSet rotto = new HashSet();
		//로또 사이즈가 6개가 되도록
		
		
		for (int i = 0; rotto.size() < 6; i++) {
			//임시 저장
			int num = (r.nextInt(45)+1);
			//로또에 저장			
			System.out.println(num);
			rotto.add(num);
		}
		
		/*
		while (rotto.size() < 6) {
			//로또에 저장
			rotto.add(r.nextInt(45)+1);
			//이전리스트와 비교가능한지 확인하는 메서드
			//rotto.contains(num);
		}
		*/
		//결과 출력
		System.out.println(rotto);
	}

}
