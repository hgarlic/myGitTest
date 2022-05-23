package ch07;

public class RadioTest {
	public static void main(String[] args) {
		Radio rd = new Radio();
		rd.channel = 89.1;
		rd.volume = 12;
		rd.onOff = true;
		System.out.println("[브리츠 라디오]");
		if(rd.onOff = true) {
		System.out.println("라디오가 켜져 있습니다.");
		} else {
		System.out.println("라디오가 꺼져 있습니다.");
		}
		System.out.println("현재 채널은 " + rd.channel+"입니다.");
		System.out.println("볼륨은 " + rd.volume+"입니다.");

		System.out.println();
		
		Radio ir = new Radio();
		ir.channel = 95.1;
		ir.volume = 9;
		ir.onOff = false;
		System.out.println("[아이리버 라디오]");
		if(ir.onOff = true) {
		System.out.println("라디오가 켜져 있습니다.");
		} else {
		System.out.println("라디오가 꺼져 있습니다.");
		}
		System.out.println("현재 채널은 " + ir.channel+"입니다.");
		System.out.println("볼륨은 " + ir.volume+"입니다.");
	}
}
