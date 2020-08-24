package 배열기본;

public class 배열기본2 {

	public static void main(String[] args) {
		// 일주일간 온도를 넣은 공간을 만들어서
		// 데이터를 넣고 전체 출력

		// 배열은 일반적으로 같은 타입을 묶을 때 사용한다.
		// 다양한 타입을 묶을대는 배열을 쓰지 않는다.
		// 배열은 고정된 크기를 가진다. 크기 조절 불가능 => index사이즈
		double temp[] = new double[7];

		temp[0] = 35.5;
		temp[1] = 36.5;
		temp[2] = 37.5;
		temp[3] = 35.6;
		temp[4] = 36.6;
		temp[5] = 37.6;
		temp[6] = 35.7;

		String day[] = new String[7];
		day[0] = "일요일";
		day[1] = "월요일";
		day[2] = "화요일";
		day[3] = "수요일";
		day[4] = "목요일";
		day[5] = "금요일";
		day[6] = "토요일";

		for (int i = 0; i < temp.length; i++) {
			System.out.println(day[i] + "의 온도는 " + temp[i]);
		}

	}

}
