package ch11;

public class AbstractExtends extends AbstractClass {

	@Override
	void method1() { //부모클래스(추상클래스)에서 미구현된 메소드 구현시켜야함
		System.out.println("추상 method를 완성한 메소드");
		
	}
	public static void main(String[] args) {
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
		
	}
}
