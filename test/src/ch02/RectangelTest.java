package ch02;

import java.util.Scanner;

public class RectangelTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("=================================");
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		double a = in.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		double b = in.nextDouble();
		
		double area = a * b;
		
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
		System.out.println("=================================");

		in.close();
		
		
	}
	
}
