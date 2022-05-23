package ch13;

import java.util.Random;

import java.util.Scanner;

public class MyGame {
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		Scanner sc = new Scanner(System.in);
		
		String[] aa = {"가위","바위","보"};
		Random r = new Random();
		System.out.print("가위, 바위, 보 중 하나를 입력하세요(종료는 exit) : ");
		String rps = sc.next();
		
		while(true) {
			if(rps.equals("exit")) {
				System.out.println("게임을 종료합니다.");
				break;
			 }
			String i = aa[r.nextInt(3)];
			
			if(i.equals(rps)){
				System.out.println("비겼습니다. 컴퓨터는 " + i + "입니다.");
				break;
			} else if(i.equals("가위") && rps.equals("바위")) {
				System.out.println("이겼습니다. 컴퓨터는 " + i + "입니다.");
				break;
			} else if(i.equals("가위") && rps.equals("보")) {
				System.out.println("졌습니다. 컴퓨터는 " + i + "입니다.");
				break;
			} 
			  else if(i.equals("바위") && rps.equals("바위")) {
				System.out.println("비겼습니다. 컴퓨터는 " + i + "입니다.");
				break;
			} else if(i.equals("바위") && rps.equals("보")) {
				System.out.println("이겼습니다. 컴퓨터는 " + i + "입니다.");
				break;
			} else if(i.equals("바위") && rps.equals("가위")) {
				System.out.println("졌습니다. 컴퓨터는 " + i + "입니다.");
				break;
			} 
			  else if(i.equals("보") && rps.equals("보")) {
				System.out.println("비겼습니다. 컴퓨터는 " + i + "입니다.");
				break;
			} else if(i.equals("보") && rps.equals("가위")) {
				System.out.println("이겼습니다. 컴퓨터는 " + i + "입니다.");
				break;
			} else if(i.equals("보") && rps.equals("바위")) {
				System.out.println("졌습니다. 컴퓨터는 " + i + "입니다.");
				break;
			} 
			sc.close();

		} //end while
	} //end print()
}
