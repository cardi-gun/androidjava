package 배열응용;

public class 식구들배열 {
	public static void main(String[] args) {
		String[] familyname = {"아버지", "어머니", "형", "나", "동생"};
		int[] familyAge = {100, 88, 33, 24, 10};
		double[] familytail = {177.5, 152.2, 190.3, 167.7, 155.3};
		
		System.out.println("우리집 식구 정리");
		System.out.println("--------------------");
		System.out.println("이름"+"\t"+"나이"+"\t"+"키");
		//for문의 인덱스를 같이 가져가게 되면 상당히 편하게 자료를 정리할수 있다. 
		for (int i = 0; i < familytail.length; i++) {
			System.out.println(familyname[i]+"\t"+familyAge[i]+"\t"+familytail[i]);
		}
		
		
	}
}
