package ch10;

public class PolyEx {
	public static void main(String[] args) {
		int a = 10;
		double b = 20;
		char c = 'A';
		String d = "hello";
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		//Object는 최상위 클래스, 이렇게 그대로 사용하면 프로그램 무거워지며
		//메모리 많이 잡아먹고, 속도가 느려짐
		//Object는 타입하나로 모든 타입 다 다룰수 있음
		//즉, 한개의 자료형으로 다양한 형태의 자료형을 처리할 수 있음.
		//이런 능력을 다형성이라고 한다.(polymorphism)
		Object e = 10;
		System.out.println(e);
		Object f = 21.3;
		System.out.println(f);
		Object g = 'A';
		System.out.println(g);
		Object h = "hello";
		System.out.println(h);
		
	}
}
