package ch02;

import java.util.Scanner;
//Ctrl + Shiht + O 키를 누르면 위처럼 나옴

//키도브로부터의 사용자 입력 프로그램
public class ScannerEx {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		//스캐너(Scanner) 객체 : 키보드로부터 값을 입력 받게 하는 객체

		System.out.println("첫 번째 정수값?");//안내문구
		int x = in.nextInt(); //정수값을 입력받도록 하는 메소드인 nextint()
		System.out.println("두 번째 정수값?");
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x * y);
		
		
		
		
			
	}
}
