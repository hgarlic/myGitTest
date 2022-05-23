package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str = "kim,20,180,55,서울,학생"; // 콤마, tab, /룰 주어서 데이터를 구분함
		String[] items = str.split(",");
		for(String s : items) {
			System.out.println(s);
		}
		
		StringTokenizer st = new StringTokenizer(str, ",");
		int cnt = st.countTokens(); //토큰의 갯수
		System.out.println("토큰의 갯수 : " + cnt);
		
		while(st.hasMoreElements()) { //다음 요소의 내용이 있으면 계속 돔
			System.out.println(st.nextToken());
			
		}
		
	}
}
