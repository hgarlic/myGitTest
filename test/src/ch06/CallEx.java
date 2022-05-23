package ch06;

public class CallEx {

	
	public static void test(int b) { //b에 a값이 대입됨.
		System.out.println("test method 호출");
		System.out.println(b);
	} //end test
	
	public static void main(String[] args) {
		System.out.println("시작");
		int a = 10;
		test(a); // a는 call by value 형식으로 호출하는 것
		
		test2(a);
		System.out.println("끝");
		
	} //end main
	
	public static void test2(int a) { //a에 main의 a값이 대입됨
		System.out.println(a);
	} //end test2
}
