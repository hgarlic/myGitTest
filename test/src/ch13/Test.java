package ch13;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1)); //올림
		System.out.println(Math.round(10.5)); //반올림
		System.out.println(Math.floor(10.9)); //버림
		
		Random rand = new Random();
		System.out.println("정수 : " + rand.nextInt(45));
			
		int a = 10;
		Integer b = 20; // 옛 jdk버전에서는 에러
		Integer c = new Integer(30);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue());
	}
}
