package ch04;

import java.util.Scanner;

//while 과 scanner활용 구구단 출력프로그램 만들기
/*출력 결과 :
 * 구구단 중에서 출력하고 싶은 단을 입력하세요: 0
 * 2x1 = 2
 */
public class While_Gugu {
	public static void main(String[] args) {
		int dan;
		int j=1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		dan = in.nextInt();
		
		while(j<=9) {
			System.out.println("** " + dan + " 단 **");
			System.out.println(dan+" x "+ j + " = " + (dan*j));
			j++;

			}

		
		
	}
}
