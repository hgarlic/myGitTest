package ch13;

//Wrapper class : 기본 자료형을 포장해주는 것(클래스로)
//class에서는 다양한 기능 정의, 얻고 싶은 기능을 클래스로 만들어서 처리.
//기본자료형에 대한 다양한 메소드를 지원해주기 위해 클래스로 만드는 것
//byte => Byte
//short => Short
//int => Integer
//long => Long
//float => Float
//double => Double
//char => Character
//boolean => Boolean

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10; 
		Integer i2 = new Integer(20); //auto boxing 현상
		//이게 정석
		int num1 = i1.intValue();
		int num2 = i2; //auto unboxing(객체로 포장된 value를 꺼내는 작업)
		int sum = num1 + num2;
		System.out.println(sum);
		System.out.println(i1+i2);
		System.out.println(i1+num2);
		
		//2진수 문자열로 변환
		System.out.println(Integer.toBinaryString(sum));
		//8진수 문자열로 변환
		System.out.println(Integer.toOctalString(sum));
		//16진수
		System.out.println(Integer.toHexString(sum));
		
		System.out.println(Integer.MAX_VALUE);//정수의 최대값
		System.out.println(Integer.MIN_VALUE);//정수의 최소값
		
		//****중요, 앞으로 많이 쓸거임 문자열을 정수로 변환해주는 것
		System.out.println(Integer.parseInt("100")); //"100" => 100
		
		//정수를 문자열로
		System.out.println(Integer.toString(100)); //100 => "100"
		System.out.println(100+""); //100은 문자열이 됨 100=> "100"
		
	}
}
