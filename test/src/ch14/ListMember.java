package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		
		//1)방법
		Member m1 = new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPassword("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@naver.com");
		
		list.add(m1); //ArrayList에 Member 객체를 1개 추가
		System.out.println(list.size());
		
		//2)방법 : 생성자를 통해 데이터 초기화
		Member m2 = new Member("hong", "1234", "홍길동", "02-222-3333", "hong@nate.com");
		list.add(m2);
		
		//3)방법 : add()메소드 내에서 생성자 활용
		list.add(new Member("choi", "1234", "최수만", "031-111-2222", "choi@gamil.com"));
		
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for(int i=0;i<list.size();i++) {
			Member m = list.get(i); //여기서 m은 ArrayList의 각 데이터를 가르키는 임시 참조변수
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPassword()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
		
	}
}
