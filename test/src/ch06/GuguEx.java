package ch06;

import java.util.Scanner;

public class GuguEx {
	public static void gugu(int a) {
		for(int i=1; i<=9; i++) {
			System.out.println(a + " x "+ i + " = " + a*i);
		}

	} //end gugu
	
	public static void guguAll(int a) {
		for(int i=a; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" x "+j+ " = " + i*j);
				
			}
		}

	} //end guguAll
	
	public static void main(String[] args) {
		
		System.out.println("==첫번째 gugu메소드 활용==");
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요(2~9) : ");
		int dan;
		dan = sc.nextInt();
		gugu(dan);
		System.out.println();
		System.out.println("==두번째 guguAll메소드 활용==");
		guguAll(2);
		System.out.println();
	sc.close();
	
	} //end main
}
