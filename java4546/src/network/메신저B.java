package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저B extends JFrame {
    private JTextField input;
    private JTextArea list;
    DatagramSocket socket, socket2;
    InetAddress ip;


	public 메신저B() throws Exception {
		socket = new DatagramSocket(6000);
        socket2 = new DatagramSocket();
        
        ip = InetAddress.getByName("127.0.0.1");
        
		setTitle("메신저B");
		setSize(450, 750);

		list = new JTextArea();
		list.setFont(new Font("Monospaced", Font.PLAIN, 30));
		list.setBackground(Color.ORANGE);
		list.setForeground(Color.WHITE);
		getContentPane().add(list, BorderLayout.CENTER);

		input = new JTextField();
		input.setBackground(SystemColor.activeCaption);
		input.setFont(new Font("굴림", Font.PLAIN, 30));
		getContentPane().add(input, BorderLayout.SOUTH);
		input.setColumns(10);

		// list에 글씨을 쓰거나 건들일수없게 변경
		list.setEditable(false);

		// input에 동작 리스너 추가
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 데이터 가져오는부분
				String data = input.getText();
				// 입력한 값 가지고와서, 리스트에 추가
				list.append("나 >> " + data + "\n");
				// input에 써놨던 데이터 지우기
				input.setText("");
				// 상대방에게 네트워크 전송

				// 메세지 보내기
				// 상대방에게 네트워크 전송!
				// UDPSender
				try {
					byte[] data2 = data.getBytes();
					DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 5000);
					socket.send(packet);
					//socket.close();
				} catch (Exception e2) {
					System.out.println("데이터 보내는중에 에러가 발생했습니다.");
				}

			}
		});
		setVisible(true);
	}

	// 상대방이 보내는 데이터 확인
	public void process() {
		while (true) {

			// 계속 받을수 있도록 무한루프
			try {
				// UDPReciver
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				list.append("너 << " + new String(data) + "\n");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("데이터를 받는중에 에러가 발생했습니다.");

			}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		메신저B m = new 메신저B();
		m.process();

	}

}
