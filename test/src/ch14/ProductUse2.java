package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse2 {
	
	public void result() {
		List<Product2> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("제품정보를 입력하세요! (종료: 99)");
		
		while(true) {
			Product2 p = new Product2();
			p.input();
			list.add(p); 
			System.out.println("계속입력하시려면 아무키나 입력하고 엔터를 누르세요! (종료: 99)");

			if("99".equals(sc.next())) {
				System.out.println("입력을 종료합니다.");
				break;
			} 

		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("일련번호\t제품명\t제조사\t제조일자\t\t단가(천원)\t수량\t금액");
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Product2 m = list.get(i);
			System.out.println(m.getNum()+"\t"+m.getName()+"\t"+m.getCo()+"\t"+m.getDay()+"\t\t"
			+String.format("%,d", m.getPrice())+"\t"+m.getCount()+"\t"
			+((m.getPrice()*m.getCount())+(m.getPrice()*m.getCount())*0.1));
			}
		System.out.println("------------------------------------------------------------");

	}

	
	public static void main(String[] args) {
		ProductUse2 p = new ProductUse2();
		p.result();
		
		
	}
}
