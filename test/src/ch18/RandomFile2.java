package ch18;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {
		String str = null;
		try {
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand2.txt", "rw"); //읽기쓰기 모드
			file.seek(9);
			file.write("park".getBytes()); //인덱스 8번 위치에서 기존 내용을 덮어쓰게됨.
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일이 저장되었습니다.");

	}
}
