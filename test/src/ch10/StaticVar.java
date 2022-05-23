package ch10;

public class StaticVar {
	static int a=10; //static 멤버
	int b = 20;	//non-static 멤버
	public static void main(String[] args) {
		//static 멤버는 new(객체생성)를 안해도 클래스이름.스태틱멤버이름 으로 접근해서 쓸수 있음
		System.out.println(StaticVar.a);
		
		StaticVar s = new StaticVar();
		System.out.println(s.b);
		
	}
}
