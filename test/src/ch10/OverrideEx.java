package ch10;

class Test11{
	//오버라이딩은 메소드의 header(리턴타입, 매개변수 등) 가 동일해야함.
	public void print() {
		System.out.println("test11");
		
	}
}

class Test22 extends Test11{
	public void print() { //override(메소드 재정의)
		super.print();
		System.out.println("test22");
	}
}


public class OverrideEx { //상속관계개념들어가게
	public static void main(String[] args) {
		Test22 t = new Test22();
		t.print();
	}
	
}
