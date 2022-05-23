package ch10;

//static => 메모리의 특정한 static영역을 사용 / 객체 생성은 안하고 무조건 자동적으로 메모리 로딩됨
//non-static => (일반적인 변수, 메소드) 객체가 생성된 후에(new) 메모리 로딩됨
//static method 에서는 static안의 로컬변수(일반변수)나 static으로 정의된 멤버변수만 사용가능

public class A {
	//멤버변수(non-static)
	String name = "kim";
	
	// static 멤버변수
	static int n = 20;
	
	//non-static 멤버메소드
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	
	//static 멤버메소드
	public static void main(String[] args) {
		//멤버변수(non-static)
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n); //static은 static 끼리 통한다
		
		A aa = new A(); // 객체를 생성한 후에나 non-static 멤버들을 사용할수 있음.
		System.out.println(aa.name); // 참조변수.non-static멤버변수
		//System.out.println(name); 사용안됨
		//해당메인메소드 안에 있는 non-static멤버변수는 사용할 수 있지만
		//밖에 있는 non-static멤버변수는 사용 불가, 바로 사용못하고 객체 생성해서 써야함
		aa.print();
		//print(); 역시 non-staitc 메소드이기때문에 바로 사용안됨, 객체생성후 써야함
	}		
}
