package ch04;

public class StarEx_2 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) { //줄 5개 생성
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}	System.out.println();
		}
	}
}
