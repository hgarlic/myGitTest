package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, size;
		int total=0;
		double avg;
		char grade;

		System.out.print("성적처리할 학생수를 입력하세요 : ");
		size = sc.nextInt();
		int[][] ar = new int[size][5];

		for(int i=0; i<ar.length; i++) {
				System.out.print((i+1)+"번 학생의 국어, 영어, 수학 성적을 입력하세요 : ");
				ar[i][0] = sc.nextInt();
				ar[i][1] = sc.nextInt();
				ar[i][2] = sc.nextInt();
				ar[i][3] = ar[i][0]+ar[i][1]+ar[i][2];
				ar[i][4] = ar[i][3]/3;
		}
		
		for(int i=0; i<ar.length; i++) {
		System.out.println((i+1) + "번 학생의 점수 : "+ ar[i][0] +"\t"+ ar[i][1]+"\t"+ar[i][2]);
		}
		
		System.out.println();
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");

		for(int i=0; i<ar.length; i++) {
			num = i+1; //번호출력
			if(ar[i][4]>=90) {
				grade = 'A';
			} else if (ar[i][4]>=80) {
				grade = 'B';
			} else if (ar[i][4]>=70) {
				grade = 'C';
			} else if (ar[i][4]>=60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println(num +"\t"+ ar[i][0]+"\t"+ ar[i][1]+"\t"+ ar[i][2]+"\t"+ ar[i][3]+"\t"+ ar[i][4]+"\t"+grade);
		}
	} //main
}
