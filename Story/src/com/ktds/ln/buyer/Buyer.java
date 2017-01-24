package com.ktds.ln.buyer;

public class Buyer {

	private int money;
	private int productQuantity;
	
	public Buyer( int money, int productQuantity ) {
		
		System.out.println("Buyer을 생성합니다.");
		setMoney(money);
		setProductQuantity(productQuantity);
		
		System.out.println(this);
	}
	
	public void setMoney( int money ) {
		this.money = money;
	}
	
	public void setProductQuantity( int productQuantity ) {
		this.productQuantity = productQuantity;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public int getProductQuantity() {
		return this.getProductQuantity();
	}
	
	
	
	
}
