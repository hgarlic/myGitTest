package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamEx2 {
	public static void main(String[] args) {
		InputStream is = System.in; //1byte(8비트) 처리 스트림
		InputStreamReader isr = new InputStreamReader(is); //2byte(16비트) 처리 스트림 - 한글처리 가능
		//new InputStreamReader(InputStream)
		try {
			System.out.println("한글자를 입력하세요 : ");
			int code = isr.read(); //글을 읽음
			System.out.println("code : " + code);
			char ch = (char)code; //int타입 code를 char 타입 ch로 바꿔주는 형변환 필요
			System.out.println("char : " + ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
