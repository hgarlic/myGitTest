package ch11;

public class Test2 extends Test{
	@Override
	public void print() { //헤더, 부모의 추상메소드를 오버라이딩해서 구현해줘야함
		//구현부, body (이부분만 있으면 완성 메소드로 간주함)
		System.out.println("추상클래스를 상속받아 구현함");
	}	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.print();
	}
}

abstract class Test {
	public void input() {
		System.out.println("input메소드");
	}
	public abstract void print(); //추상메서드(미완성 메소드)
	//추상메소드가 있으면 추상클래스 해당 클래스는 추상클래스가 됨
	//abstract 붙여야함(메소드, 클래스 둘다)
	
}


