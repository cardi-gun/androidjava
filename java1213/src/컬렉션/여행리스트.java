package 컬렉션;

import java.util.HashSet;

public class 여행리스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//여행리스트 한번다녀온 곳은 가지 않음.
		HashSet travel = new HashSet();
		
		travel.add("유럽");
		travel.add("일본");
		travel.add("필리핀");
		travel.add("캐나다");
		travel.add("미국");
		
		System.out.println("이전에 다녀온 여행지 : "+travel);
		
		travel.add("유럽");
		travel.add("아프리카");
		travel.add("일본");
		travel.add("필리핀");
		travel.add("중국");
		//중복인 유럽, 일본, 필리핀 삭제
		System.out.println("이번에 다녀온 여행지 : "+travel);

	}

}
