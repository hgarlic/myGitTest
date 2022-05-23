package ch17;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ch09.SportsCar;

public class MyJApplet extends JFrame{
	private Image img;
	JLabel imgLabel = new JLabel();

	public MyJApplet() {
		setTitle("연습해보기");
		CreateMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(imgLabel,BorderLayout.CENTER);
		setVisible(true);
		setSize(500, 500);
		setLocation(200, 200);
	}
	
	void CreateMenu() {
		JMenuItem me = new JMenuItem("EXIT");
		JMenuItem c1 = new JMenuItem("HIDE");

		JMenuBar menubar = new JMenuBar(); //메뉴바 생성
		JMenu mu = new JMenu("Animal"); //animal 메뉴 생성
		
		JMenuItem[] munuItems = new JMenuItem[3];
		String[] items = {"Dog", "Brid", "Other"};
		
		MyJAppletImage aa = new MyJAppletImage();
				
		for(int i=0; i<munuItems.length; i++) {
			munuItems[i] = new JMenuItem(items[i]);
			munuItems[i].addActionListener(aa);
			mu.add(munuItems[i]);
			if(i==1) mu.addSeparator();
		}
		
		JMenu cc = new JMenu("Car"); //animal 메뉴 생성
		JMenuItem[] munuItems2 = new JMenuItem[3];
		String[] items2 = {"SportsCar", "NomalCar", "Other"};
				
		for(int i=0; i<munuItems2.length; i++) {
			munuItems2[i] = new JMenuItem(items2[i]);
			munuItems2[i].addActionListener(aa);
			cc.add(munuItems2[i]);
			if(i==1) cc.addSeparator();
		}

		menubar.add(me);
		menubar.add(c1);
		menubar.add(mu);
		menubar.add(cc);
		
		setJMenuBar(menubar);
		
		c1.addActionListener(aa);
		
		me.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
		
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	class MyJAppletImage implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "Dog":
				imgLabel.setVisible(true);			
				imgLabel.setIcon(new ImageIcon("src/ch17/dog.png")); 
				break;
			case "SportsCar":
				imgLabel.setVisible(true);			
				imgLabel.setIcon(new ImageIcon("src/ch17/car.gif")); 				
				break;
			case "HIDE":
				imgLabel.setVisible(false);			
				break;
			} 
		}
	}
		
	public static void main(String[] args) {
		new MyJApplet();
	}
}

