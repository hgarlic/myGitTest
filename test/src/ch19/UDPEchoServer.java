package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP 방식 - 비연결성(단방향 전송)
//TCP 방식 = 연결성(서버와 클라이언트(들)가 서로 연결된 상태에서 데이터 송수신)

public class UDPEchoServer {
	public UDPEchoServer(int port) {
		try {
			DatagramSocket ds = new DatagramSocket(port);
			while(true) {
				//UDP방식은 데이터를 바이트배열로 전송함, String을 바로 보낼 수 없음
				//(참고: 바이트 배열의 최대크기는 65508)
				byte buffer[] = new byte[512];
				//udp 방식의 통신은 데이터를 패킷(데이터 조각) 단위로 만들어서 전송함
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				System.out.println("ready");
				
				// 클라이언트가 보낸 메세지를 수신, 소켓을 통해 수신된 클라이언트의 메세지를 DatagramPacket에 저장
				ds.receive(dp); 	
				
				//클라이언트에서 보낸 메시지(바이트배열)를 String으로 변환해줘야함 ==> new String(바이트배열) -> 문자열로 변환
				String str = new String(dp.getData()); 
				System.out.println("클라이언트에서 보낸 메세지 : " + str);
				
				InetAddress ia = dp.getAddress(); //클라이언트측 ip주소 get
				port = dp.getPort(); //클라이언트 측 포트번호 get
				System.out.println("Client ip : " + ia + ", Client port : " + port);
				
				//클라이언트에게 전송할 패킷을 생성
				//(바이트배열, 바이트배열크기, ip주소값, port번호)
				dp = new DatagramPacket(dp.getData(), dp.getData().length, ia, port);
				
				ds.send(dp); //클라이언트에게 자료전송
				ds.close(); //소켓 닫기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //생성자
	
	public static void main(String[] args) throws Exception{
		new UDPEchoServer(3000); //서버측 포트번호 셋팅
	}
}
