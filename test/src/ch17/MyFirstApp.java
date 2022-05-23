package ch17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFirstApp extends JFrame implements ActionListener{

	public MyFirstApp() {
		super("버거킹 메뉴판");
		setSize(500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel panel1 = new JPanel();
		panel1.setSize(300,100);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		
		page1.setLayout(null);
		page1.setBounds(0,0,400,600);
		panel1.setBackground(Color.red);
		JLabel label_1 = new JLabel("안녕하세요. 버거킹입니다. \n원하시는 메뉴를 선택하세요.");
		panel1.add(label_1); //패널에 라벨을 붙임
		JLabel label2_2 = new JLabel("원하시는 메뉴를 클릭하여 주세요.");
		panel3.add(label2_2); //패널에 라벨을 붙임


		//버튼생성
		JButton button1 = new JButton("햄버거");
		JButton button2 = new JButton("치킨");
		JButton button3 = new JButton("사이드");
		JButton button4 = new JButton("음료");	
		JButton button5 = new JButton("종료");	

		//패널에 버튼을 추가
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

		//패널에 다른 패널 추가
		panel1.add(panel2);
		//panel1.add(panel3);
		
		add(panel1, "North");
		add(panel3,"Center");
		add(page1);
		
		
		ActionListener handler = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("햄버거")) {
					JOptionPane.showMessageDialog(null
							, "햄버거를 선택하셨습니다. \n가격:8,000원", "햄버거"
							,JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("치킨")) {
					JOptionPane.showMessageDialog(null
							, "치킨을 선택하셨습니다. \n가격:20,000원", "치킨"
							,JOptionPane.INFORMATION_MESSAGE);	
				} else if(e.getActionCommand().equals("사이드")) {
					JOptionPane.showMessageDialog(null
							, "사이드를 선택하셨습니다. \n가격:5,000원", "사이드"
							,JOptionPane.INFORMATION_MESSAGE);
				} else if(e.getActionCommand().equals("음료")) {
					JOptionPane.showMessageDialog(null
							, "음료를 선택하셨습니다. \n가격:1,000원", "음료"
							,JOptionPane.INFORMATION_MESSAGE);
				} else if(e.getActionCommand().equals("종료")) {
					JOptionPane.showMessageDialog(null, "프로그램을 정말 종료하시겠습니까?"
							, "종료", JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				}
				
			}
		};
		
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
		button5.addActionListener(handler);

	}
	
	JPanel page1 = new JPanel() {
		Image background=new ImageIcon(MyFirstApp.class.getResource("javaProject/src/image/bgk.png")).getImage();
		public void paint(Graphics g) {
			g.drawImage(background, 0, 0, null);//
		}
	};
	
	public static void main(String[] args) {
		new MyFirstApp();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			
	}
}
