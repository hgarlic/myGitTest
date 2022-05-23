package ch07;

public class TelevisionTest4 {
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 24;
		myTv.volume = 30;
		myTv.onOff = true;
		
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
		System.out.println("현재 볼륨은 " + myTv.volume +"입니다.");
		System.out.println("현재 myTv상태는 " + myTv.onOff +"입니다.");


	}
}
