package 이차원배열;

import java.util.Random;

public class 지역남녀분류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(42);
		int[] input = new int[100];
		String[] people = new String[100];
		String[] city = new String[100];
		String[] gender = new String[100];
		for (int i = 0; i < people.length; i++) {
			input[i] = rand.nextInt(4000000)+1000000;
			people[i] = Integer.toString(input[i]);	
		}
		//지역남녀 분류 2로 이동		

		int seoul = 0;
		int seoulm = 0;

		for (int i = 0; i < people.length; i++) {
			gender[i] = people[i].substring(0,1);
			city[i] = people[i].substring(1,2);
			if(city[i].equals("1")) {
				seoul++;
				if(gender[i].equals("1")||gender[i].equals("3")) {
					seoulm++;
				}else {

				}
			}
		}//for
		
		System.out.println("서울지역 : "+seoul+" 명, 남자 : "+seoulm+"명, 여자 : "+(seoul-seoulm)+"명");
		
		
		
		
	}//main

}//class
