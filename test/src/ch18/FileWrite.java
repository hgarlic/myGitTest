package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		//프로그램 입장에서 ==> 파일(출력 스트림을 씀)
		
		OutputStream os= null;
		try {
			os=new FileOutputStream("c:\\test\\aa.txt");
			//큰따옴표안에서 원래 하나인 \ 를 하나더 써서 \\ 두개써야함
			System.out.println("입력하세요 : ");
			while(true) {
				int ch  = System.in.read(); //1바이트로 읽음
				if(ch == 13) break;
				os.write(ch); //파일에 입력된 값이 저장됨.
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
