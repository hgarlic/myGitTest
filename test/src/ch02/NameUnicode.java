package ch02;

public class NameUnicode {
	public static void main(String[] args) {
		
		String name = "\uBB38\uD638\uC131";
		char a = '\uBB38';
		char b = '\uD638';
		char c = '\uC131';
		
		System.out.println("출력결과 :");
		System.out.println("========================");
		System.out.println(name);
		System.out.println("------------------------");
		System.out.println("char형(\'\\uBB38\'): " + a );
		System.out.println("char형(\'\\uD638\'): " + b );
		System.out.println("char형(\'\\uC131\'): " + c );
		System.out.println("========================");

	}
}
