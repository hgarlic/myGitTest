package ch04;

public class StarEx_4 {
	public static void main(String[] args) {
		int a = 1;
		int b =3;
		
		for(int i=0; i<7; i++) {
			if(i<3) {
				for(int j=b; j>0; j--) {
					System.out.print("");
				}
				for(int j=0; j<a; j++ ) {
					System.out.print("*");
				}
				for(int j=b; j>0; j--) {
					System.out.print("");
				}
				a +=2;
				b--;
			}
			
			
		}
	}
}
