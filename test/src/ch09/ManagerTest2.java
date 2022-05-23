package ch09;

public class ManagerTest2 {
	public static void main(String[] args) {
		Manager2 ma = new Manager2();
		ma.setNum("20220101");
		ma.setName("홍길동");
		ma.setAddress("서울 강남구");
		ma.setEmail("hong@gmail.com");
		ma.setSalary(5000);
		ma.setRrn("123456-1234567");
		ma.setBonus(300);
		
		ma.print();
		
	}
}
