package ch04;

import java.util.Scanner;

public class Nested_If {
	public static void main(String[] args) {
		int a, b;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요 : ");
		a = scan.nextInt();
		System.out.print("범위로 쓸 정수를 입력하세요 : ");
		b = scan.nextInt();
		scan.close();
		
		if(a > b) {
			if((a % 2) == 0) {
				System.out.println(a+"은(는)"+b+"보다 큰 짝수");
			} else {
				System.out.println(a+"은(는)"+b+"보다 큰 홀수");
			} 
			} else {
				if((a % 2)==0) {
					System.out.println(a+"은(는)"+b+"보다 작은 짝수");
				} else {
					System.out.println(a+"은(는)"+b+"보다 작은 홀수");
				}
		}
	}
}
