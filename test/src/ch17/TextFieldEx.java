package ch17;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		super("텍스트필드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20)); //텍스트필드의 입력 길이값 설정
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과", 20)); //컴퓨터공학과가 디폴트값으로 적혀있는 것
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시...", 20));
		c.add(new JLabel("비번"));
		c.add(new JPasswordField(20)); //비밀번호 표시 텍스트필드
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
