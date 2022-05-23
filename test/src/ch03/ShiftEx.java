package ch03;

public class ShiftEx { //시프트 연산 연습
	public static void main(String[] args) {
		int a = 2; // 2진수로 바로 변환 0010, 1111 => 15
		
		int b = a << 2; // 0010 << 2 => 1000(십진수: 8)
		System.out.println(b);
		
		b = b >> 2; // 1000 >> 2 => 0010(십진수 : 2)
		System.out.println(b);
		
	}
}
