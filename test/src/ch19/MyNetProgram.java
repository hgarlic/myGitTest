package ch19;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class MyNetProgram {
	public static void main(String[] args) {
		
		System.out.println("1) 나의 랜카드 정보 : ");
		//1) 나의 랜카드 정보 :
		try {
			Enumeration<NetworkInterface> lci = NetworkInterface.getNetworkInterfaces();
			while(lci.hasMoreElements()) {
				NetworkInterface net = lci.nextElement();
				System.out.println(net);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	System.out.println();
	
	System.out.println("2) naver.com의 서버들");
		//2) naver.com의 서버들
		try {
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		//3) naver.com의 호스트 이름
		try {
			InetAddress adr = InetAddress.getByName("naver.com"); 
			System.out.println("3) naver.com의 호스트이름 : " + adr.getHostName()); 
			System.out.println("메인 IP번호 : " + adr.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//4) 나의 사용 port번호들
		ServerSocket so = null; 
		System.out.println();
		System.out.println("4) 나의 사용 port번호들 : ");
		for(int i=0; i<=65535; i++) {
			try {
				so = new ServerSocket(i); 
				so.close(); 
			} catch (Exception e) { 
				System.out.println(i + "번 포트는 사용중입니다.");
			}
		}
		
	} //main
}
