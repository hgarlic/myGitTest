package ch03;

public class CastEx2 {
	public static void main(String[] args) {
		int a = 500;
		float b = 200.2f;
		int c = 127;
		
		double d = a; // int타입인 a가 double타입으로 자동형변환 됨
		System.out.println("int a => double : " + d);
		
		int e = (int) b; // 명시적 형변환(축소형)
		System.out.println("float b => int : " + e);
		
		byte f = (byte) c;
		System.out.println("int c => byte : " + f);
		
		
	}
}
