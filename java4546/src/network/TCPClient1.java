package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
		//서버와 연결 하기위한 소캣 생성, 연결
		Socket socket = new Socket("localhost" , 1234);
		
		System.out.println("client"+(i+1)+" 서버와 연결됨"); 
		
		//서버에서 보낸 소켓을 받는 부분
		//BufferedReader로 읽어와야 문자의 형태로 사용이 가능 
		//InputStreamReader로 socket과 BufferedReader을 연결(bridge)해줘야한다.
		//=>getInputStream은 1byte씩 처리를 하고 BufferedReader2byte씩 처리를 하기 때문에 InputStreamReader로 연결해줘야한다.
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String data = input.readLine();
		System.out.println("받은 데이터:" +data);
		}
		//연결종료
		System.exit(0);
		
	}

}
