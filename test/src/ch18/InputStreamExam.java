package ch18;

import java.io.IOException;

//스트림 : 데이터의 논리적인 통로
//1byte단위로 처리가 됨

//프로그램 기준
//InputStream(입력스트림)
//OutputStream(출력스트림)

public class InputStreamExam {
	public static void main(String[] args) {
		int var = 0;
		//파일 입출력 프로그램은 try ~ catch 문안에서 필수로 작성해야함, 네트워크, db관련 프로그램또한..
		try {
			System.out.println("내용을 입력하세요 : ");
			var = System.in.read(); //키보드로부터 1byte를 읽음. 따라서 한글(2byte)처리 불가능
			while(var != 13) {//enter키를 입력할때까지 반복
				System.out.println(var + "==>" + (char)var); //int형 var를 문자형(char)로 형변환해서 출력
				//모든 문자에는 고유 숫자코드가 있음.(아스키) 
				var = System.in.read();
				
			}
		} catch (IOException e) { //입출력관련 예외처리
			e.printStackTrace();
		}
	}
}
