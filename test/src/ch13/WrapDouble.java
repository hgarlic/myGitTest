package ch13;

public class WrapDouble {
	public static void main(String[] args) {
		Double num1=new Double("11.5");
		//Double num1=new Double(11.5); 따옴표 쓰고 안쓰고 다 가능!!
		
		double num2=3.5; //기본자료형
		double num3 = num1/num2; 
		// (타입이 틀린데 정상 작동하는 건 auto unboxing이 작용하기 때문)
		// num1 => Double, num2 =>double
		
		System.out.println(num3);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		String str = "11.5";
		System.out.println(str+200); //글자 연결
		System.out.println(Double.parseDouble(str)+200); //값 연산

	}
}
