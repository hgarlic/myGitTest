package ch09;

public class Employee {
	public String name; //이름
	String address; //주소 ( default)
	protected int salary; //월급
	private String rrn; //주민등록번호
	
	public String getRrn() { //rrn에 대한 getter
		return rrn;
	}
	
	//기본생성자
	public Employee() {}
	
	//매개변수가 있는 생성자
	public Employee(String name, String address, int salary, String rrn) { 
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}
	//@ : 어노테이션(Annotation)이라고 하며, 컴파일러에게 추가적인 정보를 제공해주는 메타데이터로서 
	//	  주석으로도 활용하거나 또는 프로그램에게 특정기능을 정의하거나 실행하도록 정보제공용으로 사용
	//    스프링에서 본격적으로 활용함

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
}
