package ch10;

public class Test {
	static int a; //static 멤버변수
	int b; //non-static 멤버변수
	void print() { // non-static 멤버메소드
		//non-static 멤버 안에서는 static멤버를 얼마든지 사용가능함.
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println(a); // static 멤버변수이기때문에 바로 사용가능
		
		//System.out.println(b); // non-static 멤버변수이기때문에 바로 사용 불가
		Test t = new Test(); // 그렇기 때문에 객체 생성(new) 해야만 사용 가능
		System.out.println(t.b); //참조변수이름.변수이름

		System.out.println(t);
		t=null; //null하면 참조변수는 주소를 잃고 메모리에서 떠돌아다님
		System.out.println(t);
	}
}
