package ch16;

public class MyBankPlayer extends Thread{
	int type;
	MyBank mybank;
	MyBank n1 = new MyBank();
	
	
	MyBankPlayer (int type, MyBank mybank) {
		this.type = type;
		this.mybank = mybank;
	}
	public MyBankPlayer() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1: mybank.bankPlayerA(); break;
		case 2: mybank.bankPlayerB(); break;
		case 3: mybank.bankPlayerC(); break;
		}
	}
	
}
