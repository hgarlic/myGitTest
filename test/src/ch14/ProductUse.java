package ch14;

import java.util.ArrayList;
import java.util.List;

public class ProductUse {
	public void print1() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("냉장고", "삼성", "20220101", 200, 4));
		list.add(new Product("TV", "LG", "20220101", 300, 2));
		list.add(new Product("에어컨", "위니아", "20220101", 100, 4));
		System.out.println("------------------------------------------------------------");
		System.out.println("제품명\t제조사\t제조일자\t\t단가(만원)\t\t수량\t금액");
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Product p = list.get(i);
			System.out.println(p.getName()+"\t"+p.getCo()+"\t"+p.getDay()+"\t"+p.getPrice()+"\t\t"+p.getCount()+"\t"+(p.getPrice()*p.getCount()));
		}
		System.out.println("------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		ProductUse p =new ProductUse();
		p.print1();		
	}
}
