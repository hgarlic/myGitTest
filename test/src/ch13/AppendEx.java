package ch13;

public class AppendEx {
	public static void main(String[] args) {
		//실제쓰임새는 짧은 문자열 처리할 때 
		String a = "hello"; //불변성
		//String Pool안에 있으면서 불변성을 가짐
		System.out.println(a);
		a = a+"java";
		System.out.println(a);
		
		//가변성(mutable)
		//실제 쓰임새는 긴 문자열을 처리하고자 할 때
		StringBuilder b = new StringBuilder("hello");
		b.append("java");
		System.out.println(b);
	}
}
