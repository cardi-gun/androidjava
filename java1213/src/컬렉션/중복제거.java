package 컬렉션;

import java.util.HashSet;

public class 중복제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중복제거, hashset
		HashSet bag = new HashSet();
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("핸드폰");
		bag.add("볼펜");
		System.out.println(bag.size());
		//알아서 중복을 제거해주기때문에 사이즈가 3개가 된다.
		//그냥 리스트를 읽으면 알아서 나온다.
		System.out.println(bag);
	}

}
