package ch04;

public class StarEx_3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>0; j--) {
				if(j>i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			} //for
			System.out.println();
		}
	}  //main
}
