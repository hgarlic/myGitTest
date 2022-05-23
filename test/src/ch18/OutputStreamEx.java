package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		//콘솔창에 별도의 스트림값을 출력하기 위해 사용
		PrintStream ps = System.out;
		OutputStream os=ps; //PrintStream 객체를 부모타입인 OutputStream으로 받아 처리한다.
		//OutputStream도 1byte 처리 스트림이다. 따라서 한글처리 불가능
		
		try {
			os.write(97);//a
			os.write(98);//b
			os.write(99);//c
			os.flush(); //flush() 를 써야 메모리에 있던 것이 출력됨
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
