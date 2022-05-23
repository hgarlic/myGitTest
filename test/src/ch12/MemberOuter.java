package ch12;

import java.util.Scanner;

public class MemberOuter {
	private static int num;
	private static String name;
	private static String mail;
	
	class TestInner{
		void print() {
			System.out.println("-----------------------");
			System.out.println("고객번호 : " + num);
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + mail);
			System.out.println("-----------------------");

		}
	}
	
	public static void main(String[] args) {
		MemberOuter mem = new MemberOuter();
		MemberOuter.TestInner in = mem.new TestInner();
		Scanner sc = new Scanner(System.in);
		System.out.print("고객번호를 입력하세요 : ");
		num = sc.nextInt();
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("이메일을 입력하세요 : ");
		mail = sc.next();
		in.print();
		
		
	}
}
