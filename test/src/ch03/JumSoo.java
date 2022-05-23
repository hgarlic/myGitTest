package ch03;

import java.util.Scanner;

public class JumSoo {
	public static void main(String[] args) {
		
		String name;
		int java, html, jsp, db, tot;
		double avg;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = in.next();
		System.out.print("Java : ");
		java = in.nextInt();
		System.out.print("HTML : ");
		html = in.nextInt();
		System.out.print("JSP : ");
		jsp = in.nextInt();
		System.out.print("DB : ");
		db = in.nextInt();
		in.close();
		
		tot = java+html+jsp+db;
		avg = tot / 4.0;
		System.out.println("=======================================================");		
		System.out.println("이름\tJava\tHTML\tJSP\tDB\t총점\t평균");
		System.out.println("-------------------------------------------------------");		
		System.out.println(name+"\t"+java+"\t"+html+"\t"+jsp+"\t"+db+"\t"+tot+"\t"+avg);
		System.out.println("=======================================================");		

	}
}
