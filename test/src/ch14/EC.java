package ch14;

public class EC {
	private int no; //주문번호
	String orderDate; //주문일자
	String product;// 주문상품
	String cardName; //신용카드명
	String cardNO; //카드번호
	int pay; //결제금액
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNO() {
		//return cardNO;
		return cardNO.substring(0, 5) + "****" + cardNO.substring(9, 11);
	}
	public void setCardNO(String cardNO) {
		this.cardNO = cardNO;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public EC() {
	}
	public EC(int no, String orderDate, String product, String cardName, String cardNO, int pay) {
		super();
		this.no = no;
		this.orderDate = orderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNO = cardNO;
		this.pay = pay;
	}
	
}
