package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		//  복사본(OutputStream) <= [프로그램] <= (InputStream객체)원본
		// 원본을 프로그램으로 가져올때는 InputStream객체 사용
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer= null;
		
		String file1="c:\\test\\aa.txt"; //원본파일
		String file2="c:\\test\\b.txt"; //복사본
		
		try {
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			
			while(true) {
				str = reader.readLine(); //한 라인을 읽는 것 \r\n 라인의 끝을 인식
				//\r carriage retrun : 포인트가 앞줄로 다시 옴
				if(str==null) break;
				writer.write(str+"\r\n");
			}
			System.out.println("파일 복사가 완료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close(); //리소스를 개별적으로 닫아줌
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
