package ch10;


//만약 회사정보가 홈페이지에서 쓰일 떄 여러파일에서 사용된다면 이처럼 상수화해서 값만 바꿔주면 편하다.

public class Info {
	public static void main(String[] args) {
		//사용 : 클래스이름.상수명
		System.out.println("회사명:"+Constants.COMPANY_NAME);
		System.out.println("전화번호:"+Constants.TEL);
		System.out.println("주소:"+Constants.ADDRESS);


	}
}
