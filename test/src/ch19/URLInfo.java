package ch19;

import java.net.URL;

public class URLInfo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://cafe.naver.com/jaspresso?iframe_url_utf8=%2FArticleRead.nhn%3FreferrerAllArticles%3Dfalse%26menuid%3D2%26page%3D3%26boardtype%3DL%26clubid%3D30704603%26articleid%3D2");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트 : " + url.getPort());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("파일 : " + url.getFile());
			System.out.println("기타 : " + url.toExternalForm());
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
