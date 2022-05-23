package ch16;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame{
	private JLabel label;
	class MyThread extends Thread{
		@Override
		public void run() {
			for(int i = 10; i>=0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i+ "");
			} //for
			System.exit(0);//자동으로 창을 종료
		} //run
	} //MyThread
	public CountDownTest() { //기본생성자
		setTitle("카운트다운");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Strat");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		(new MyThread()).start();
		setVisible(true); //화면을 보게 해줌
		//화면세팅은 보통 기본생성자에
	}
	
	public static void main(String[] args) {
		new CountDownTest(); //
	}
}
