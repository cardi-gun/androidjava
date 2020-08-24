package 배열응용;

public class 최대값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {55, 11, 22, 99, 33};
		//해당인덱스까지의 최대값을 저장해두기로 함.
		int max = num[0];
		//큰값이나 작은 값을 찾을 때는 초기값을 0으로 주면 문제가 발생한다. 
		//비교대상들의 첫번째 값을 넣어주는게 일반적이다.
		for (int i = 1; i < num.length; i++) {//num[0]부터시작이기때문에 1부터 반복
			//이전까지의 최대값은 max에 저장, 배열의 인덱스 값을 하나씩 꺼내 이전까지의 최대값보다 큰지 비교
			//해당 인덱스의 값이 이전까지의 최대값보다 클때 해당인덱스의 값을 최대값 변수에 저장한다.
			if(num[i] > max) {
				//11 > 55 false => 55
				//22 > 55 false => 55
				//99 > 55 true => 55
				//33 > 99 false => 99
				max = num[i];
			}
			
		}//for
		
		System.out.println("최대값은 : "+max);
		
	}//main

}//class
