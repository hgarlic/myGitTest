package ch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception {
		
		ServerSocket serverSocket = null;  //서버소켓 준비
		try {
			//서비스를 위한 포트 개방
			serverSocket = new ServerSocket(5555);
			System.out.println("서비스가 시작되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서비스를 시작할 수 없습니다.");
			System.exit(1); //비정상적 종료처리(1 or -1), 정상종료(0);
		}
		
		//일반(클라이언트용) 소켓 준비
		Socket clientSoket = null; 
		try {
			//클라이언트의 접속을 기다렸다가 접속되면 소켓을 연결
			clientSoket = serverSocket.accept();
			System.out.println("클라이언트 ip : " + clientSoket.getInetAddress().getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//발신용 스트림 생성
		PrintWriter writer = new PrintWriter(clientSoket.getOutputStream(), true);
		
		//수신용 스트림 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(clientSoket.getInputStream()));
		String receive = " ";
		String send = "Welcome!!!";
		
		writer.println(send); // 메세지 보내기
		Scanner sc = new Scanner(System.in);
		while(true) {
			receive = reader.readLine(); //한 라인을 읽음
			if(receive == null || receive.equals("quit")) { //종료조건
				break;
			}
		
		System.out.println("[client] " + receive);
		System.out.println("서버님 안녕하세요(종료:quit) :");
		send = sc.nextLine();
		writer.print(send);
		if(send.equals("quit")) break;
		}
		sc.close();
		writer.close();
		reader.close();
		clientSoket.close();
		serverSocket.close();
	}
}
