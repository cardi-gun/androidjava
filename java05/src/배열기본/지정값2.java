package 배열기본;

public class 지정값2 {

	public static void main(String[] args) {
//		이름, 나이, 성별, 아침, 몸무게 배열
		String[] names = { "김민병", "김은옥", "조혜정", "허재화", "김창희", "김정하" };
		for (String x : names) {
			System.out.println(x);
		}
		int[] age = { 1, 2, 3, 4, 5, 6 };
		for (int x : age) {
			System.out.println(x);
		}
		char[] gender = { '남', '여', '여', '여', '남', '여' };
		for (char x : gender) {
			System.out.println(x);
		}
		boolean[] meal = { false, true, true, false, false, false };
		for (boolean x : meal) {
			System.out.println(x);
		}
		double[] weight = { 85.4, 40.1, 40.2, 40.3, 99.9, 40.4 };
		for (double x : weight) {
			System.out.println(x);
		}

		for (int i = 0; i < weight.length; i++) {
			System.out.print(names[i] + "  ");
			System.out.print(age[i] + "  ");
			System.out.print(gender[i] + "  ");
			System.out.print(meal[i] + "  ");
			System.out.print(weight[i] + "  ");
			System.out.println("");
		}

	}

}
