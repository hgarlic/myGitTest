package ch03;

public class ConditionEx {
	public static void main(String[] args) {
		int num = -5;
		System.out.println(num > 0 ? num : -num); 
		//false라서 -5인데 -가 붙어서 부호반전됨 : -(-5) = 5
		
		if(num > 0) { //if 제어문 true
			System.out.println(num);
		} else { //if 제어문 false
			System.out.println(-num);
		}
		
		
		
	}
}
