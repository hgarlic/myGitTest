package ch02;

public class Box {
	//사각형 넓이, 둘레를 구하는 프로그램
	//가로 길이 = 10.0, 세로 길이 = 5.0
	// 넓이 : 가로 * 세로
	// 둘레 : (가로+세로) * 2
	
	public static void main(String[] args) {
		double width; //가로
		double hight; //세로
		double area; //넓이
		double perimeter; //둘레값용
		
		width = 10.0;
		hight = 5.0;
				
		area = width * hight;
		perimeter = (width + hight) * 2.0;
		
		
		
		System.out.println("사각형의 넓이 : " + area);
		//여기서의 "+"기호는 연결연산자로서 좌,우의 문자 또는 값을 연결만 해준다.
		System.out.println("사각형의 둘레 : " + perimeter );
		
		
		
				
	}
}
