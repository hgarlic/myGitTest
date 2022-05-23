package ch08;

public class MyManageUse {
	public static void main(String[] args) { 
		//1)getInstance()를 호출하여 처음호출이면 score 멤버변수에 10 초기화
		MyManager mgrobj = MyManager.getInstance(); //첫번째 싱글톤 호출
		System.out.println(mgrobj);
		System.out.println("mgrobj.getScore() : " + mgrobj.getScore());
		mgrobj.setScore(100); // score 멤버변수에 100을 초기화
		System.out.println("mgrobj.getScore() : " + mgrobj.getScore());
		
		//2번째 호출이기 때문에 기존 객체의 주소값을 리턴받아옴
		MyManager newMgr = MyManager.getInstance(); //두번째 싱글톤 호출
		System.out.println(newMgr);
		//두번째 싱글톤 호출이기 때문에 처음 mgr주소값만 리턴을 받아와서 newMgr에 초기화를 해줌
		System.out.println("newMgr.getScore() : " + newMgr.getScore());
		
	}
}
