package ch12;

public class OuterClass {
	//OuterClass의 static멤버변수
	private static int x = 10;
	class Inner{ //inner class
		int getX() {
			return x;
		}
	} //end inner
	
	public static void main(String[] args) {
		System.out.println(x);
		OuterClass e = new OuterClass();
		OuterClass.Inner in = e.new Inner();
		System.out.println(in.getX());
	}
}
