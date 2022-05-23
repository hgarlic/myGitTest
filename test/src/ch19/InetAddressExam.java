package ch19;

import java.net.InetAddress;

public class InetAddressExam {
	public static void main(String[] args) {
		try { //네트워크 프로그램도 try-catch(예외처리) 필수
			InetAddress address = InetAddress.getByName("google.com"); //호스트이름, ip주소 뽑아오는 처리
			System.out.println(address);
			System.out.println(address.getHostName()); //호스트이름(도메인이름) 뽑아오는 처리
			System.out.println(address.getHostAddress());//ip주소값 뽑아오는 처리
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
