package ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {
	public static void main(String[] args) {
//		PrintStream ps = System.out;
//		OutputStream os = ps;
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//한줄로 요약
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("환영합니다.\n");
			bw.write("Java");
			bw.newLine(); //개행처리 메소드
			bw.write("World");
			bw.flush();
			bw.close(); //스캐너처럼 객체를 종료, close()하는게 좋다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
