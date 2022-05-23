package ch08;

public class Calculator {
	//멤버변수
	private int left;
	private int right;
	//생성자를 만들때 기본생성자를 함께 만드는 습관을 들여야한다.
	//한개라도 User define한 생성자를 만들면 더이상 컴파일러는
	//기본생성자를 자동으로 만들지 않기 때문.
	
	//기본 생성자
	public Calculator() {
		System.out.println("기본 생성자 호출...");
	}
	public Calculator(int left, int right) {
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left = left;
		this.right = right;
	}
	
	//getter, setter 
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left + right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
}
