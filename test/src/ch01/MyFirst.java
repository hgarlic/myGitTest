package ch01;

public class MyFirst {

	public static void main(String[] args) {

		int num = 0;
		int i,j;
		
		for(i=1; i<=3; i++) {
			for(j=1; j<=5; j++) {
				num = i*j;
			}
		}
		System.out.println(num);
	}

}
