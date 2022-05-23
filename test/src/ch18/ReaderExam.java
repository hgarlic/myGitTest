package ch18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStream : 1바이트 단위로 읽음, 대표적으로 System.in
//InputStreamReader : 문자단위로 읽음
public class ReaderExam {
	public static void main(String[] args) {
		int var = 0;
		
		//Reader가 InputStream을 포함하고 있음
		//InputStreamReader(InputStream)
		Reader input = new InputStreamReader(System.in);
		System.out.println("내용을 입력하세요 : ");
		try {
			while(true) {
				var = input.read(); //1문자 단위로 읽어들임
				if(var == 13) break;
				System.out.println(var+"==>"+(char)var);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
