package ch11;

//추상클래스(abstract class) - 1개 이상의 추상메소드를 가진 클래스
//추상메소드(abstract method) - 메소드 내용이 완성되지 않은 메소드
//추상클래스는 객체 생성을 할 수 없다.
//하위클래스(자식클래스)에서 상속을 받아 추상메소드를 오버라이딩해야 사용가능함.

public abstract class AbstractClass { 
	//하나라도 abstract 메소드가 있으면 클래스도 추상메소드 abstract 해야한다.
	abstract void method1(); //추상메소드
	void method2() { //완성된 메소드
		System.out.println("완성된 메소드");
	}
}
