package ch04;

public class Do_While_Ex1 {
	public static void main(String[] args) {
		int i=1;
		do {//먼저 실행을 함
			System.out.print(i);
			i++;
		} //do
		while(i<=10); //do while 문은 while끝에 ';' 찍어야함
	}
}
