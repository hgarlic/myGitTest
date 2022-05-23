package ch02;

public class VarScope {

	static int x; /*전역변수가 됨, 전역변수는 초기화 하지 않아도 자동 초기화됨. 
	int일때는 0, 논리는 false*/
	
	
	public static void main(String[] args) {
		int y = 0; // 지역변수
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
