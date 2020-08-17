package operator;

import javax.swing.JOptionPane;

public class basic {

	public static void main(String[] args) {
		//창을 띄워서 입력을 받아보자.
		//창을 띄워서 출력을 해보자.
		//자주 사용하는 것은 부품의 대문자를 그대로 쓴다.
		//특정한 일을 전담하는 부품을 만들어서 특정한 처리를 할 때 부품을 지정함.
		//4천개가 넘는 부품(=class)이 라이브러리에 있음
		
		String name = JOptionPane.showInputDialog("당신의 이름은?");
//ram에 name이라는 String형 저장공간 생성후 cpu가 dialog를 띄워줘 키보드로 입력을 받아 name에 저장
		System.out.println("당신의 이름은 "+name);
//ram에 저장되어있는 name의 값을 cpu가 가져와서 모니터에 출력한다.
		String age = JOptionPane.showInputDialog("당신의 나이는?");
//ram에 age라는 String형 저장공간 생성후 cpu가 dialog를 띄워줘 키보드로 입력을 받아 age에 저장

		//키보드를 통해 입력받은 데이터 타입은 무조건 String이다. 
		//String으로 저장된 데이터를 int/String쓸지는 프로그래머가 결정하는데
		//계산을 해야하는 경우에는 int로 변환해줘야 한다.
		
		int myAge = Integer.parseInt(age);
		//숫자로 변환하는 방법
//ram에 myAge 라는 int형 저장 공간 생성 후, 저장되어있는 age의 값을 가져와  cpu에서 age의 값을 문자형에서 정수형으로 변환하여 myAge에 저장 
		int lastAge = myAge - 1;
//ram에 lastAge라는 공간을 생성, cpu에서 ram에 있는 myAge값을 가져와 -1 연산처리를 한뒤 lastAge에 저장
		System.out.println("당신의 작년 나이는 " + lastAge);
//ram에 저장되어있는 lastAge의 값을 cpu로 가져와 모니터에 출력. 
	}

}





