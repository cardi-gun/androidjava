package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//서버가 먼저 작동해야 클라이언트에서 요청이 가능하다.
		//1. 연결요청만 담당하는 서버용 socket필요
		
		ServerSocket server = new ServerSocket(1234); //ip어드레스, 포트가 필요하다
		
		System.out.println("TCP 서버 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		
		int count = 0;//연결횟수 확인용
		
		while (true) {//서버는 계속 확인 해야하기 때문에 무한으로 돌린다.
			//2. 연결이 되면 클라이언트 소켓 생성
			Socket socket = server.accept();
			count++;
			System.out.println(count+"번째 연결 "+ "클라이언트와 : 서버와의 연결 성공.");
			//3. 소켓을 통해 클라이언트측에 데이터 전송.
			//printwriter 뒤 true는 패킷이 다 차지 않아도 전송을 시키게 해준다.(원래 패킷이 다 차지 않으면 발송하지 않음)
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.println("i'm a java programmer..?");
		}
	}

}
