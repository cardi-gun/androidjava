package 클래스사용하기;

import 클래스만들기.용돈계산기;

public class 용돈기입장 {

	public static void main(String[] args) {
		용돈계산기 cal = new 용돈계산기();
		int firstmonth = 6;
		int lattermonth = 5;
		int pocket = 100000;
		
		int firstpocket = cal.mul(firstmonth, pocket);
		int latterpocket = cal.mul(lattermonth, pocket);
		System.out.println("상반기용돈: " +firstpocket);
		System.out.println("하반기용돈: "+latterpocket);
		System.out.println("------------------------------");
		
		int addfirst = 0;
		int addlatter = 0;
		//변수 먼저 선언해줘야 한다.
		if(firstpocket<=500000) {
			addfirst = cal.add(firstpocket, 150000);
		}else {
			addfirst = firstpocket;
		}
		
		if(latterpocket<=500000) {
			addlatter = cal.add(latterpocket, 150000);
		}else {
			addlatter = latterpocket;
		}
		
		int yearpocket = cal.add(addfirst, addlatter);
		
		System.out.println("상반기용돈_수정: "+addfirst);
		System.out.println("하반기용돈_수정: "+addlatter);
		System.out.println("------------------------------");

		System.out.println("일년용돈: "+yearpocket);
	}

}
