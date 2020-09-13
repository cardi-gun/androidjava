package 컬렉션;

import java.util.HashMap;

public class 고객관리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap customer = new HashMap();
		
		customer.put(100, "김데이");
		customer.put(200, "김사전");
		customer.put(300, "김구조");
		customer.put(400, "김자료");
		
		System.out.println(customer);
		//200번 삭제, 300번 개명
		customer.remove(200);
		customer.put(300, "김충성");
		
		System.out.println(customer);
	}

}
