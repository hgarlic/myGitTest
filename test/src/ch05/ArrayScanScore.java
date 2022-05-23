package ch05;

import java.util.Scanner;

//배열, 스캐너, for each문 활용
public class ArrayScanScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size;
		int total=0;
		double avg;
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		size = scan.nextInt();
		int[] ar = new int[size];
		


		for(int i=0; i<ar.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			ar[i] = scan.nextInt();
			//total += ar[i];
		}
		
		for(int abc : ar) {
			total += abc;
		}

		
		avg= (double)total/ar.length;
		scan.close();
		
		
		System.out.println("총점은 " + total + "점 입니다.");
		System.out.println("평균 성적은 " + String.format("%.1f", avg) + "점 입니다.");

		
	}
}
