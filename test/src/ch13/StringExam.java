package ch13;

public class StringExam {
	public static void main(String[] args) {
		String str1 = new String("Hello World");
		//메모리의 heap영역에 생성(new를 했기떄문)
		String str2 = new String("Hello World");
		//메모리 힙영역에 생성
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println("======= (==)사용 =======");
		if(str1==str2) { //내용이 아니라 주소값을 비교
			System.out.println("str1과 str2는 같은 인스턴스를 참조합니다.");
		} else {
			System.out.println("str1과 str2는 다른 인스턴스를 참조합니다.");
		}
		
		System.out.println("======= equals()사용 =======");
		if(str1.equals(str2)) { //내용 비교
			System.out.println("str1과 str2는 같은 내용입니다.");
		} else {
			System.out.println("str1과 str2는 다른 내용입니다.");

		}
	}
}
