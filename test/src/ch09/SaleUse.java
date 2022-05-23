package ch09;

public class SaleUse {
	public static void main(String[] args) {
		Sale s1 = new Sale();
		s1.input(101, "냉장고", "LG", "202205", 200, 9);
		s1.calc();
		s1.print();
		
	}
}
