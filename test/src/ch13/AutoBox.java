package ch13;

public class AutoBox {
	public static void main(String[] args) {
		//기본자료형
		int num1 = 10;
		int num2;
		
		Integer i1; 
		//객체 참조변수(주소값 저장), 아직은 선언만 했기에 i1의 값은 NULL상태
		Integer i2 = new Integer(20);
		//Wrapper Class로서 auto boxing(기본자료형을 객체로 박스처리)
		i1 = num1;
		num2 = i2;
		// auto unboxing 처리가 된 것(객체 안에 들어있는 값을 풀어서 저장)
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);

		
	}
}
