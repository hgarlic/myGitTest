package ch04;

public class ContinueEx1 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			if(i % 5 ==0) continue; // 5의 배수를 만나면 이하 코드(println) 무시, 다시 for의 조건식으로 
			
			System.out.println(i);
			
		}
	}
}
