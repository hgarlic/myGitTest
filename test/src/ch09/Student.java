package ch09;

public class Student {
	//멤버변수
	//protected 는 자식클래스에서 접근 가능, private만 상속이 안되서 접근 안됨
	private String name; //이름
	private String num;	//학번
	private String major; // 전공
	private int year; //학년
	
	public Student() {} //기본생성자

	//생성자로 매개변수 처리
	//생성자도 메소드와 같은 역할, 특별한 형태의 메소드임
	//생성자는 클래스와 이름이 같으나 데이터 타입이나 개수가 다름
	
	
//	public Student(String name, String num, String major, int year) {
//		this.name = name;
//		this.num = num;
//		this.major = major;
//		this.year = year;
//	}
	
	
	
	//일반 메소드로 매개변수 처리
	public void intput(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}	
	
}
