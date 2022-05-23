package ch02;

public class ConstantTest {
	public static void main(String [] args) {
		final double KM_PER_MILE = 1.609344;
		//상수 = 변하지 않는 값임, final을 넣어서 상수처리함
		double km;
		double mile = 60.0;
		
		km = mile * KM_PER_MILE;
		
		System.out.println("60마일은 " + km + "킬로미터입니다.");
		
		
	}
}
