package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요 : ");
		int year = sc.nextInt();
		GregorianCalendar cal = new GregorianCalendar();
		if(cal.isLeapYear(year)) { //윤년 계산 메소드: isLeapYear
			//참고 : 메소드이름에 is로 시작하는 메소드 대부분은 리턴값이 boolean타입임
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
		
		
	}
}
