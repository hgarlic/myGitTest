package ch07;

public class BookStoreUse {
	public static void main(String[] args) {
		BookStore bs = new BookStore();
		bs.setName("Java");
		bs.setWriter("김선생");
		bs.setPublisher("영진");
		bs.setYear(2022);
		bs.setPrice(30000);
		bs.setNum(10);
		
		bs.print();
	}
}
