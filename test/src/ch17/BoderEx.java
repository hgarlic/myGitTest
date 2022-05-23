package ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BoderEx extends Frame{
	//GUI프로그램 코딩에서는 main메소드에서 GUI 코딩보다 Frame extends 받아서 
	//기본생성자에 안에서 GUI 코드처리하는 것을 더 권장한다.
	
	public BoderEx() {
		setTitle("BorderLayout 예제");
		setSize(300, 200);
		setVisible(true);
		
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");
		
		//Frame의 기본 레이아웃은 보더레이아웃이기때문에 setLayout 생략가능
		//setLayout(new BorderLayout());
		add(b1, "East");
		add(b2, "West");
		add(b3, "South");
		add(b4, "North");
		add(b5, "Center"); //또는 add(b5)

		//윈도우 창 닫기 기능
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	} //기본생성자 BorderEx()
	public static void main(String[] args) {
		new BoderEx();
		
	}
}
