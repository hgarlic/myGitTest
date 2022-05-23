package ch10;

public class StaticMethod {
	static int a=0; //static 멤버변수
	int b=20; //non-static 멤버
	
	public static void printA() { //static 멤버메소드
		System.out.println(a);
		//System.out.println(b); => 안됨, non-static은 static메소드에서 쓸수없음
		StaticMethod s = new StaticMethod();
		System.out.println(s.b);
	}
	public void printB() { //non-static 멤버메소드에서는 static멤버도 쓸수있음
		System.out.println(a); //static
		System.out.println(b); // non - static
	}
	
	public static void main(String[] args) { //static 멤버
		printA();
		//printB(); => static 멤버 안에서는 non-static멤버를 바로 쓸수없음
		
		StaticMethod a = new StaticMethod();
		a.printB(); // non-static 멤버는 반드시 new를 통해 객체화 한 후 사용가능
		
	}
}
