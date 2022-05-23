package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam2 {
	public static void main(String[] args) {
		try {
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
			//getAllByName : 여러개의 ip주소를 리턴, 그렇기 때문에 배열로 처리함
		} catch (UnknownHostException e) { 
			//UnknownHostException : 알려지지 않은 호스트(주소) 관련 오류처리
			e.printStackTrace();
		}
	}
}
