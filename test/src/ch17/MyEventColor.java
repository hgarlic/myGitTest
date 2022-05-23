package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor extends JFrame implements ActionListener{
	private JButton button1, button2, button3, button4;
	private JFrame f;
	private Color c;
	private Container con;
	
	public MyEventColor() {
		setTitle("MyEventColor");
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button1 = new JButton("Red"); //버튼생성 및 버튼제목설정
		button2 = new JButton("Green"); //버튼생성
		button3 = new JButton("Blue"); //버튼생성
		button4 = new JButton("White"); //버튼생성
		
		add(button1, "North");
		add(button2, "East");
		add(button3, "South");
		add(button4, "West");
	
		button1.addActionListener(new MyEventColor(this, Color.red));
		button2.addActionListener(new MyEventColor(this, Color.green));
		button3.addActionListener(new MyEventColor(this, Color.blue));
		button4.addActionListener(new MyEventColor(this, Color.white));
	}

	
	public MyEventColor(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);		
	}

	public static void main(String[] args) {
		new MyEventColor();
	}


	
}
