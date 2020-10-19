package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket();//보내는 쪽은 포트를 적지 않는다. 어차피 패킷에 작성하기 때문에
		//보낼String 작성
		String str = "i'm a android programmer..?";
		//byte단위로 전송하게 되기에, String을 byte화 해준다.
		byte[] data =str.getBytes();
		
		//ip를 String이 아닌 ip객체화 하기 위해 InetAddress를 사용한다.사용하지 않으면 string으로 안다. 127 0 0 1  기본 자기 자신 ip
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		//패킷생성 => 데이터, 데이터길이, ip , 포트번호 로 패킷생성
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
		
		//소캣을 통해 패킷 전송
		socket.send(packet);
		socket.close();
	}

}
