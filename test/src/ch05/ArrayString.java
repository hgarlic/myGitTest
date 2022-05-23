package ch05;

public class ArrayString {
	public static void main(String[] args) {
		String[] str = {"Java", "DB", "JSP", "HTML"};
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
			
		}
		
		System.out.println();
		//확장 for문(for each) ==> Java 1.5부터 사용 가능
		
		for(String st : str) { //st는 개별변수, str은 집합변수
			
			System.out.println(st);
		}
		
	}
}
