package ch10;

class Triangle extends Figure {
	void draw() {
		System.out.println("삼각형 그리기...");
	}
}

class Rectangle extends Figure{
	@Override
	void draw() {
		System.out.println("사각형 그리기...");
	}
}

class Circle extends Figure{
	void draw() {
	System.out.println("원 그리기...");
	}
}

public class Figure {
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	
	public static void main(String[] args) {
		//좌변과 우변의 클래스 이름이 같다.
		Triangle t = new Triangle();
		t.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Circle c = new Circle();
		c.draw();
		System.out.println("==================");
		
		
		//좌변은 부모클래스, 우변은 자식클래스 (다형성)
		//**다형성**(중요) : 좌변-부모, 우변-자식
		Figure f = new Triangle();
		f.draw();
		f = new Rectangle();
		f.draw();
		f = new Circle();
		f.draw();
	}
}
