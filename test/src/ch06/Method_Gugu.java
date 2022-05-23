package ch06;

import java.util.Scanner;

public class Method_Gugu {
	static void gugu(int dan) {
		for(int i =1; i<=9; i++) {
			System.out.println(dan + "x" + i+ " = " + dan*i);
		}
	} //end gugu
	
	public static void main(String[] args) {
		int dan;
		System.out.print("단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		gugu(dan);
		sc.close();
		
	}
}
