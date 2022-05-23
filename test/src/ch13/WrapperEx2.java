package ch13;

public class WrapperEx2 {
	public static void main(String[] args) {
		//Charater사용
		
		System.out.println(Character.toLowerCase('A')); //대문자를 소문자로
		char c1= '4', c2= 'F';
		if(Character.isDigit(c1)) 
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2))
			System.out.println(c2 + "는 영문자");
		
		//Integer 사용
		System.out.println(Integer.parseInt("200")); // 문자열을 십진수로 변환
		System.out.println(Integer.toString(200)); //숫자를 문자열로 변환
		System.out.println(Integer.toBinaryString(200)); //십진수를 이진수로 변환
		
		Integer i = new Integer(200);
		System.out.println(i.doubleValue()); //정수를 double값으로 변환(unboxing 처리)
		
		//Double 사용
		Double d = new Double(3.14);
		System.out.println(d.toString()); //Double을 문자열로 변환
		System.out.println(Double.parseDouble("3.14")); //문자열을 실수값으로 변환
		
		//Boolean
		boolean b = (4>3); //b는 4가 3보다 클때 true
		System.out.println(Boolean.toString(b)); //boolean형 true를 문자열 ture로 변환
		System.out.println(Boolean.parseBoolean("false")); //문자열을 boolean형 false로  바꿔줌
		
		
	}
	
}
