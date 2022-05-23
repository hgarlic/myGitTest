package ch12;
//지역내부클래스(메소드 안에 생성되는 클래스)
//해당되는 메소드 안에서 지지고 볶고 함.

public class LocalOuter {
	private int data = 30;
	void display() {
		class LocalInner{
			void msg() {
				System.out.println(data);
			}
		}// end inner class
		LocalInner li = new LocalInner(); //내부객체 생성
		//지역내부클래스는 반드시 해당 메소드 안에서 객체생성 해야함!!!
		
		li.msg(); 
	} // end method
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
		
	}
}
