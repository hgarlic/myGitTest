package ch10;

class A2{
	//만약에 부모클래스에서 멤버메소드 중에 final이 붙으면 오버라이딩이 안된다.(상속이 안되니까)
	void print() { //non-static
	//final void print() { 
		System.out.println("a");
	}
}

class B2 extends A2{
	void print() { //메소드 오버라이딩(재정의), non-static
		super.print(); //부모쪽 메서드 호출
		System.out.println("b");
	}
}


public class FinalMethod {
	public static void main(String[] args) {
		B2 b = new B2();
		b.print();
	}
}
