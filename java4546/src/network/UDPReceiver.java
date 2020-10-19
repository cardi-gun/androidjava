package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
	//socket프로그램(=network프로그램)
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//리시버가 먼저 동작이 되어야 보내는걸 받을수 있다.
		DatagramSocket socket = new DatagramSocket(7100);//받을애는 ip,port가 필요하다
		System.out.println("받는 쪽 소캣 시작");
		System.out.println("받을 준비 끝!");
		//보낸 패킷을 받을 빈 패킷 필요
		//socket.receive(p);
		//빈바이트 배열을 만들어서 패킷을 받을 빈 패킷을 만든다.
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data,data.length);
		//패킷을 소켓으로 받아옴
		socket.receive(packet);
		//받아온 데이터를 String 객체화
		System.out.println("받은 데이터:"+ new String(data));
		//종료
		socket.close();

	}

}
