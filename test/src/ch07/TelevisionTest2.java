package ch07;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television tv= new Television(); //객체 생성
		System.out.println(tv); //메모리 주소값(=해쉬코드)
		tv.channel = 7;
		tv.onOff = true;
		tv.volume = 20;
		System.out.println("나의 tv 채널은" + tv.channel +"이고 볼륨은 " + tv.volume + "입니다.");
		
		//객체는 복제 되지만 참조변수를 다르게 해야하며, 또한 그 주소값도 각각 다르다.
		
		Television yourTv = new Television(); //객체 생성
		System.out.println(yourTv);
		yourTv.channel = 11;
		yourTv.volume = 15;
		yourTv.onOff = false;
		System.out.println("너의 tv 채널은" + yourTv.channel +"이고 볼륨은 " + yourTv.volume + "입니다.");
	}
}
