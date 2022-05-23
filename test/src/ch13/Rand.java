package ch13;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));
		System.out.println(r.nextInt(101)+100);
		System.out.println(Math.random());
		int num = (int)(Math.random()*100);
		System.out.println(num);
		String[] prize = {"1등","2등","3등","다음 기회에"};
		System.out.println(prize[r.nextInt(4)]);
	}
}
