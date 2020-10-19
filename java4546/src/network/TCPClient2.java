package network;

import java.net.Socket;

public class TCPClient2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket	socket = new Socket("localhost" , 9100);
		System.out.println("client2 서버와 연결됨"); 
	}

}
