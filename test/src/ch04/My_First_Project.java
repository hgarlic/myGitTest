package ch04;

import java.util.Scanner;

/*제어문들을 활용하여 아래와 같이 고르는 프로그램을 만들어보세요
 * 메뉴구성 : (1)한식 (2) 양식 (3) 중식 
 * (1) 한식 중 (1) 김치찌개 (2) 된장찌개 (3) 삼겹살 (4) 비빔밥
 * (2) 양식 중 (1) 돈까스 (2) 비프스테이크 (3) 카레라이스
 * (3) 중식 중 (1) 짜장면 (2) 짬뽕 (3) 탕수육 
 * 
 */
public class My_First_Project {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("(1) 한식");
			System.out.println("(2) 양식");
			System.out.println("(3) 중식");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			String tmp = sc.next();
			menu = Integer.parseInt(tmp);			
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(menu <1 || menu > 3) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			if(menu == 1) {
			for(;;) { //while문의 true처럼 무한반복됨 for문 -> ';;'
				System.out.println("원하는 메뉴(1~4)를 선택하세요.(이전 단계 돌아가기: 0, 종료: 99)>");
				System.out.println("(1) 김치찌개");
				System.out.println("(2) 된장찌개");
				System.out.println("(3) 삼겹살");
				System.out.println("(3) 비빔밥");
				tmp = sc.next();
				num = Integer.parseInt(tmp);
				if(num == 0)
					break;
				if(num == 99) break outer; //전체종료	
				switch(num) {
				case 1:
					System.out.println("고객님은 김치찌개를 선택하셨습니다"); 
					break;
				case 2:
					System.out.println("고객님은 된장찌개를 선택하셨습니다"); 
					break;
				case 3:
					System.out.println("고객님은 삼겹살을 선택하셨습니다"); 
					break;
				case 4:
					System.out.println("고객님은 비빔밥을 선택하셨습니다"); 
					break;
			} //switch
			}  //for
			} else if(menu == 2) {
				for(;;) { //while문의 true처럼 무한반복됨 for문 -> ';;'
					System.out.println("원하는 메뉴(1~3)를 선택하세요.(이전 단계 돌아가기: 0, 종료: 99)>");
					System.out.println("(1) 돈까스");
					System.out.println("(2) 비프스테이크");
					System.out.println("(3) 카레라이스");
					tmp = sc.next();
					num = Integer.parseInt(tmp);
					if(num == 0)
						break;
					if(num == 99) break outer; //전체종료	
					switch(num) {
					case 1:
						System.out.println("고객님은 돈까스를 선택하셨습니다"); 
						break;
					case 2:
						System.out.println("고객님은 비프스테이크를 선택하셨습니다"); 
						break;
					case 3:
						System.out.println("고객님은 카레라이스를 선택하셨습니다"); 
						break;
				
				} //switch
				}  //for
			} else if(menu == 3) {
				for(;;) { //while문의 true처럼 무한반복됨 for문 -> ';;'
					System.out.println("원하는 메뉴(1~3)를 선택하세요.(이전 단계 돌아가기: 0, 종료: 99)>");
					System.out.println("(1) 짜장면");
					System.out.println("(2) 짬뽕");
					System.out.println("(3) 탕수육");
					tmp = sc.next();
					num = Integer.parseInt(tmp);
					if(num == 0)
						break;
					if(num == 99) break outer; //전체종료	
					switch(num) {
					case 1:
						System.out.println("고객님은 짜장면을 선택하셨습니다"); 
						break;
					case 2:
						System.out.println("고객님은 짬뽕을 선택하셨습니다"); 
						break;
					case 3:
						System.out.println("고객님은 탕수육을 선택하셨습니다"); 
						break;
					
				} //switch
				}  //for
			}
			
			
		} //while
		System.out.println("프로그램을 모두 종료합니다.");

	} //main
}
