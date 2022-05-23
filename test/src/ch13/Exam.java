package ch13;

public class Exam {
	public static void main(String[] args) {
		String a = "hello";
		//메모리 상에는 String pool영역에서 다루어짐
		
		System.out.println(System.identityHashCode(a));
		String b = "hello";
		System.out.println(System.identityHashCode(b));
		//String pool영역 안의 문자열을 다룰때는 같은 문자열이 있으면
		//참조변수가 다르다고 해도 같은 주소값을 가르킴
		
		System.out.println(a ==b);
		
		String c = new String("hello");
		System.out.println(System.identityHashCode(c));
		String d = new String("hello");
		System.out.println(System.identityHashCode(d));
		System.out.println(c==d); //주소값 비교
		System.out.println(c.equals(d)); //내용 비교
	}
}
