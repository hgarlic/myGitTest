package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<EC> li = new ArrayList<>();
		li.add(new EC(1234, "2022-05-13", "티셔츠", "삼성", "37918000068", 55900));
		li.add(new EC(2345, "2022-04-11", "컴퓨터", "롯데", "15918000068", 2555000));
		li.add(new EC(3456, "2022-05-05", "커 피", "현대", "27918000068", 12000));
		
		map.put("li", li);
		print(map);
		
	}
	
	static void print(Map map) { //map은 get("key")로 꺼내옴
		//다른 데이터기 때문에 좌변에 맞게 우변을 형변환해줌
		ArrayList<EC> li2 = (ArrayList<EC>)map.get("li");
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("-----------------------------------------------------------------");
		for(EC s : li2) {
			System.out.println(s.getNo()+"\t"+s.getOrderDate()
			+"\t"+s.getProduct()+"\t"+s.getCardName()+"\t"+s.getCardNO()+"\t"+String.format("%,d", s.getPay()));
			
		}
		System.out.println("-----------------------------------------------------------------");

	}
}
