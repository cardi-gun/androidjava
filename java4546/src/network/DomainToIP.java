package network;

import java.net.InetAddress;

//domain(범위) name : www.naver.com ==> DNS(domain name system) server ==> ip주소

public class DomainToIP {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String domain = "www.naver.com";
		InetAddress ip =  InetAddress.getByName(domain);
		 
		System.out.println("ip주소"+ ip.getHostAddress());
		
	}

}
