package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {
		String website = "https://cdn.sktapollo.com/developers/poc/app.apollo.agent/static/home/a.wide.1.webp";
		
		System.out.println("다운로드를 시작합니다.");
		URL url = new URL(website); //url을 생성
		byte[] buffer = new byte[2048]; //버퍼용 바이트배열 처리[2048] => 2MB
		//      파일로 저장 <= 프로그램 <= 서버의 이미지 파일을 받아와서
		
		//try ~ with문 (java 1.7부터 도입)
		//try(리소스 선언부) { } catch(Exception e) { }
		//try ~ with문은 finally가 없어도 리소스를 자동으로 종료시켜줌
		try(InputStream in = url.openStream(); OutputStream out = new FileOutputStream("c:\\test\\test.jpg")) {
			int length = 0; //읽은 바이트 수 리턴
			
			//읽은 바이트수 = 스트림.read(버퍼)
			// -1 은 더이상 읽을 내용이 없으면 이라는 뜻...
			while((length = in.read(buffer)) != -1) {
				System.out.println(length + "바이트 읽음.");
				
				//출력스트림.write(버퍼, 시작인덱스, 길이값)
				out.write(buffer, 0, length);
			}
			System.out.println("다운로드가 완료되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
