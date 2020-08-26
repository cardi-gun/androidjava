package 이차원배열;

import java.util.Random;

public class 지역남녀분류2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(42);

		int[] people = new int[100];
		int[] city = new int[100];
		int[] gender = new int[100];
		for (int i = 0; i < people.length; i++) {
			people[i] = rand.nextInt(4000000) + 1000000;
			//자리값 설정, 400000 으로 설정하게 되면 0 부터 3999999까지 나오게 되는데
			//1000000~3999999까지는 문제가 없으나 그 이하(0~999999)의 6자리의수는 사용할수 없기에
			//1000000을 더 해줘서 1000000부터 4999999까지 출력할수 있도록 조정해준다.
		}

		int seoul = 0, busan = 0, jeju = 0, ext = 0;
		//각 지역에 사는 인원 설정.
		int seoulm = 0, busanm = 0, jejum = 0, extm = 0;
		//각 지역에 사는 남자 인원 설정. 
		for (int i = 0; i < people.length; i++) {
			gender[i] = people[i] / 1000000;
			//전체 자리에서 1000000을 나누면 몫인 첫번째 자리 저장
			city[i] = (people[i] % 1000000) / 100000;
			//전체에서 1000000을 나누고 나머지 6자리 수중에서 몫을 저장

			if (city[i] == 1) {//두번째 자리로 지역판별
				seoul++;
				if (gender[i] == 1 || gender[i] == 3) {//지역안에 성별판별
					seoulm++;
				} else {

				}
			} else if (city[i] == 2) {
				busan++;
				if (gender[i] == 1 || gender[i] == 3) {
					busanm++;
				} else {

				}
			} else if (city[i] == 3) {
				jeju++;
				if (gender[i] == 1 || gender[i] == 3) {
					jejum++;
				} else {

				}
			} else {
				ext++;
				if (gender[i] == 1 || gender[i] == 3) {
					extm++;
				} else {

				}
			}
		}
		//지역인원,지역남성, 지역인원 -지역남성 = 지역여성 출력.
		System.out.println("서울지역 인원 : " + seoul + " 남자 : " + seoulm + " 여자 :" + (seoul - seoulm));
		System.out.println("부산지역 인원 : " + busan + " 남자 : " + busanm + " 여자 :" + (busan - busanm));
		System.out.println("제주지역 인원 : " + jeju + " 남자 : " + jejum + " 여자 :" + (jeju - jejum));
		System.out.println("제주지역 인원 : " + ext + " 남자 : " + extm + " 여자 :" + (ext - extm));

	}// main

}// class
