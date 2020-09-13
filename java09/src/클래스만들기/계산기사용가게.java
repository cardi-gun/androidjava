package 클래스만들기;

public class 계산기사용가게 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.plus();
		cal.div();
		
		
		//티비 부품 사용해서 키고 끄기
		
		텔레비젼 tv = new 텔레비젼();
		텔레비젼 tv2 = new 텔레비젼();
		tv.on();
		tv2.on();
		tv.off();
	}

}
