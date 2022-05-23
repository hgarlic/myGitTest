package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank bank = new MyBank();
		MyBankPlayer hong = new MyBankPlayer(1, bank);
		MyBankPlayer saim = new MyBankPlayer(2, bank);
		MyBankPlayer lee = new MyBankPlayer(3, bank);

		hong.start();
		try {
			hong.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		saim.start();
		try { 
			saim.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lee.start();
		try {
			lee.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
