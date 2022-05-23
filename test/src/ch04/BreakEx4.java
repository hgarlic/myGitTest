package ch04;
//while, break문을 사용해서 n값이 8일 때 while문을 빠져나오는 프로그램 작성

public class BreakEx4 {
	public static void main(String[] args) {
		int n = 1;
		
		while(true) {
		 System.out.println(n+" Hello World");
		 n++;
			if(n==8) break;
		}
		
		
	}
}
