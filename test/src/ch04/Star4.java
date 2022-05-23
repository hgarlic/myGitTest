package ch04;

import java.util.Scanner;

public class Star4 {
	public static void main(String[] args) {
		System.out.println("홀수를 입력해 주세요!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) { //줄만들기
			for(int j=0; j<num; j++) {
				if(i<=num/2) { //위쪽영역
					if(i+j<=num/2-1) {
						System.out.print(" "); //위쪽영역 왼쪽 공백처리
					} else if(j-i>=num/2+1) { //위쪽영역 오른쪽 공백처리
						System.out.print(" ");	
					} else {
						System.out.print("*");
					}
				} else if(i>num/2) { //아래쪽 영역 
					if(i-j>=num/2+1) {
						System.out.print(" "); //아래쪽 영역 왼쪽 공백 처리
					} else if(i+j>=num/2*3+1) { //아래쪽 영역 오른쪽 공백 처리
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}//inner
			System.out.println();
		}//outer
		sc.close();
	} //main
}
