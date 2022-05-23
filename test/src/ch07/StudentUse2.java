package ch07;

public class StudentUse2 {
	public static void main(String[] args) {
		Student2 s2 = new Student2();
		s2.input("김만수", "컴공", 1, "123456", 4.3, 500);
		s2.print();
		System.out.println(s2);
	}
}
