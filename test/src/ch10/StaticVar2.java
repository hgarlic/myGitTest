package ch10;

public class StaticVar2 {	
	static int total; //static 메모리(클래스 영역)에 올라감
	String model;// 객체, 객체타입은 heap영역에 생성
	public StaticVar2(String model) {
		this.model = model;
		total++;
	}
	public StaticVar2() { //기본생성자는 사용하지 않더라도 만들면 좋다.
	}
}
