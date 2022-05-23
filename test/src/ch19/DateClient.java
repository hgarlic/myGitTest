package ch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DateClient {
	public static void main(String[] args) throws Exception {
		
		//new Socket("ip주소", 포트번호);
		//localhost : 내 아이피 == 127.0.0.1
		Socket s = new Socket("localhost", 8000);
		
		//서버에서 통신 연결이 되면 accept()하면 통신 가능상태로 들어감
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메세지를 받음
		String res = input.readLine();
		System.out.println(res);
		s.close(); //소켓 닫기(연결종료)
		System.exit(0);//프로그램 종료
		
	}
}
