package ch09;

class Animal{ //부모클래스
	public Animal(String s) { //매개변수 하나인 생성자 
		System.out.println("동물 : " + s);
	}
}

class Mammal extends Animal{ //부모클래스 Animal을 상속받는 자식클래스
	public Mammal() {
		//super를 쓸때는 첫째줄에 써야함.
		super("원숭이"); //부모클래스 생성자 호출, super() 부모클래스 생성자 호출
		System.out.println("포유류 : 원숭이");
	}
	
	public Mammal(String s) {
		super(s); // super는 부모클래스 생성자를 호출하는 용도
		//this() => 생성자 호출
		//super() => 부모클래스 생성자 호출
		System.out.println("포유류 : " + s);
	} 
	
}

public class AnimalDemo {
	public static void main(String[] args) {
		Mammal ape = new Mammal(); //객체 생성 및 기본 생상자 호출
		Mammal lion = new Mammal("사자"); //객체 생성 및 매개변수가 1개 있는 생성자 호출
		
	}
}
