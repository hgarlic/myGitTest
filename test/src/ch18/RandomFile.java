package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		String str = null;
		try { //r: 읽기전용 옵션, w: 쓰기전용, rw:읽기쓰기 기능
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand.txt", "rw"); //읽기쓰기 모드
			System.out.println(file.getFilePointer()); //인덱스 0번부터
			//getFilePointer() : 파일포인터(파일에서부터 가져올때 어디까지 읽었는지 가리키는 메소드)
			file.seek(8); //인덱스 8번부터 처리
			System.out.println(file.getFilePointer()); //file.seek(8)번부터 가져오게됨
			file.write("HTML".getBytes()); //인덱스 8번 위치에서 기존 내용을 덮어쓰게됨.
			//(포인터의 위치를 옮기는 메소드)
			System.out.println(file.length()); //문자 길이값 가져옴(한글은 초성,중성,종성 3바이트의 길이값을 가짐)
			System.out.println(file.getFilePointer());
			while(file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일포인터 위치 값이 적으면 반복
				str = file.readLine();
				//8859_1 ==>iso-8859-1 : 서유롭 언어 인코딩 방식(2바이트)을 utf-8(3바이트)로 바꾸는 처리
				//ms949(2바이트) 
				//utf-8 : 3바이트, 초성(1바이트), 중성(1바이트), 종성(1바이트)
				str=new String(str.getBytes("8859_1"),"utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close(); //파일이 저장됨
			System.out.println("파일이 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
