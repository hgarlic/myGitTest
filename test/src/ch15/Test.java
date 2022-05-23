package ch15;

public class Test {
	public static void main(String[] args) {
		
		//try ~ catch로 문제를 잡아보세요.
		try {
			int num = Integer.parseInt("ABC");
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 예외발생");
		}
		
	}
}
