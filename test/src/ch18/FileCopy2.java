package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

public class FileCopy2 {
	public static void main(String[] args) {
		OutputStream os = null;
		//파일 생성
		try {
			os=new FileOutputStream("c:\\test\\abc.txt");
			System.out.print("입력하세요 : ");
			while(true) {
				int ch  = System.in.read(); 
				if(ch == 13) break;
				os.write(ch); //파일에 입력된 값이 저장됨.
			} 
			System.out.println("저장되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//복사처리
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer= null;
		String file1="c:\\test\\abc.txt"; //원본파일
		String file2="c:\\test\\abcCopy.txt"; //복사본
		
		try {
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			
			while(true) {
				str = reader.readLine();
				if(str == null) break;
				writer.write(str+"\r\n");
			}
			System.out.println("파일복사가 완료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
