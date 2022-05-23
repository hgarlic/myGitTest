package ch18;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputSreamWriterEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os=ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		//OutputStreamWriter(OutputStream) 구조처리, 2byte라서 한글처리 가능
		try {
			osw.write(44032); //한글 '가'
			osw.write("나다라"); 
			osw.flush(); //flush() 써야 출력됨
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
