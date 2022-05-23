package ch17;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{
	
	//EXIT 만 메뉴아이템으로 별도 생성
	private JMenuItem mie = new JMenuItem("EXIT");
	
	public MenuEx() {
		super("Menu 예제");
		createMenu();
		setSize(300, 200);
		setVisible(true);		
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar(); //메뉴바 생성
		JMenu jm = new JMenu("File"); //File이라는 메뉴 생성
		jm.add(new JMenuItem("Open")); //메뉴안의 메뉴아이템 생성(붙임)
		jm.add(new JMenuItem("Save")); //메뉴안의 메뉴아이템 생성(붙임)
		jm.add(new JMenuItem("Print")); //메뉴안의 메뉴아이템 생성(붙임)
		jm.addSeparator(); //메뉴에 분리선 추가하는 것
		jm.add(mie);
		mb.add(jm); //메뉴바(mb)에 jm이라는 메뉴를 붙임
		mb.add(new JMenu("Edit")); //메뉴바(mb)에 Edit이라는 메뉴를 생성해 붙임
		mb.add(new JMenu("Project")); //메뉴바(mb)에 Project이라는 메뉴를 생성해 붙임
		mb.add(new JMenu("Run")); //메뉴바(mb)에 Run이라는 메뉴를 생성해 붙임

		//메뉴바를 프레임에 붙이기
		//메뉴바는 프레임에만 붙일 수 있음.
		setJMenuBar(mb);
		
		//EXIT 메뉴 아이템 클릭하면 프로그램 종료하는 기능(이벤트처리)
		mie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	} //createMenu();
	
	public static void main(String[] args) {
		new MenuEx();
		
	}
}
