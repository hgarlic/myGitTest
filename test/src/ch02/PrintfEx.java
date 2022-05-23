package ch02;

public class PrintfEx {

	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s = "Java";
		double f = 3.14;
		
		
		System.out.printf("%d\n", i);
		System.out.printf("%o\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%5d\n", d);
		System.out.printf("%-5d\n", d);
		System.out.printf("%,d\n", d);//천단위 콤마찍어줌
		System.out.printf("%s\n", s);//문자형
		System.out.printf("%5s\n", s);//오른쪽정렬하고 왼쪽 공백
		System.out.printf("%-5s\n", s);//왼쪽정렬하고 오른쪽 공백
		System.out.printf("%f\n", f);//실수형
		System.out.printf("%e\n", f);
		System.out.printf("%4.1f\n", f);
		System.out.println(String.format("%4.1f", f));
		System.out.printf("%.1f\n", f);
		//전체자리수 안정하고 소수 첫 째짜리까지 지정하는 방식
		System.out.printf("%04.1f\n", f);
		System.out.printf("%07.1f\n", f);

		int a = 3, b =5;
		
		System.out.printf("a%%b=%d\n", a%b); //%를 표현하고 싶을 때는 두번써야함 (a%%b)
		
		
	}
	
}
