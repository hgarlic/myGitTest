package ch09;

public class Manager2 extends Employee2{
	//멤버변수
	private int bonus;

	//기본생성자
	public Manager2() {}
	
	//getter, setter
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	// 멤버메소드
	public void print() {
		System.out.println("---------------------------------------");
		System.out.println("사원번호 : " + getNum());
		System.out.println("이름 : " + getName());
		System.out.println("주소 : " + getAddress());
		System.out.println("이메일 : " + getEmail());
		System.out.println("연봉 : " + getSalary());
		System.out.println("주민번호 : " + getRrn());
		System.out.println("보너스 : " + bonus);
		System.out.println("---------------------------------------");
	}
	
}
