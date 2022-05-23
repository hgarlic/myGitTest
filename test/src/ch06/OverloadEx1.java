package ch06;

public class OverloadEx1 {
	public static void main(String[] args) {
		print(10.5); // 실수형 -> 실수형인 3번을 찾아감
		print("hello"); //문자형 중 매개변수 1개짜리 찾아감
		print(100); //정수형 -> 정수형인 4번을 찾아감
		print("HI", "Java"); //문자형 매개변수 2개 - > 문자형인 2번을 찾아감
		
	} //main
	
	//1번
	static void print(String b) {
		System.out.println(b);
	} //pirnt(String b)
	
	//2번
	static void print(String a, String b) {
		System.out.print(a);
		System.out.println(b);
	}
	
	//3번
	static void print(double a) {
		System.out.println(a);
	}
	
	//4번
	static void print(int c) {
		System.out.println(c);
	}
	
	
}

