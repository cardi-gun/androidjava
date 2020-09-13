package 컬렉션;

import java.util.HashMap;

public class 맵형태목록 {

	public static void main(String[] args) {
		//매칭형태의 맵, 가장 많이 사용되고 있음
		HashMap phone = new HashMap();
		
		//phone.put(키값, 내용값);
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "친구");
		
		System.out.println(phone);
		
		//System.out.println(phone.get(키값));
		System.out.println(phone.get(1));
		//덮어쓰기!
		phone.put(3, "형");
		System.out.println(phone);

		
	}

}
