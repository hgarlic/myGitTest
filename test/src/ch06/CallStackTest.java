package ch06;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	} //end main

	public static void firstMethod() {
		secondMethod();
	} // end firstMethod

	public static void secondMethod() {
		System.out.println("secondMethod()");
	} // end secondMethod
}
