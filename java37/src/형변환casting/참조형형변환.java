package 형변환casting;

import java.awt.List;
import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {
		//참조형형변환은 상속관계에서만 가능(Casting,캐스팅) 
		//ex) Car(부모, 수퍼) - Truck(자식, 서브)
		//클래스간의 대소를 비교할 때는 개념적으로 접근
		//부모클래스가 크고, 자식클래스가 작다.
		ArrayList list = new ArrayList();
		//모든 타입을 묶을 수 있음, 크기가 유동적임
		list.add("홍길동");
		//String(작) -> object(큰) : 자동형변환
		//업캐스팅
		list.add(100);
		//Object <- (upcasting)--Integer <-(auto boxing)--int
		list.add(11.22);	
		list.add(true);	
		list.add('A');	
		list.add(new VO());
		//참조형형변환은 부모클래스가 들어갈수 있는 위치에 자식클래스가 들어갈수 있다.
		//모든 클래스는 ojbect을 상속받아 이루어져있기 때문에
		//그 하위 모든 클래스들은 add에 들어갈때 자동형변환이 되며
		//사용이 가능해진다.
		System.out.println("목록내용 : " + list);
		//업캐스트(자동형변환)으로 String으로 Object으로 형변환 하여 넣은 것은
		//꺼냈을 때 Object으로 꺼내면 String으로 추가된 기능을 쓸 수가 없다.
		//ex) Object(기능5)<--- String(상속5+추가기능5)일때 추가기능5 사용불가.
		//Object name = list.get(0);
		//그래서 꺼낼때 Stirng으로 형변환 해서 꺼내야 한다.
		//강제형변환 , down casting (다운캐스팅)
		String name = (String) list.get(0);
		
		int age = (int) list.get(1);
		//=>기본형 <--(오토 언박싱)<--Integer<--(다운캐스팅)<--Object

	}

}
