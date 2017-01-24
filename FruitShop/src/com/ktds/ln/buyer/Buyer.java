package com.ktds.ln.buyer;

import com.ktds.ln.seller.Seller;

public class Buyer {

	private int money;
	private int quantity;
	
	public Buyer( int money, int quantity ) {
		
		System.out.println("구매자를 생성합니다.");
		setMoney(money);
		setQuantity(quantity);
		
		System.out.println(this);
	}
	
	//setter, getter 
	public void setMoney( int money ) {
		this.money = money;
	}
	
	public void setQuantity( int quantity ) {
		this.quantity = quantity;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void buy( Seller seller ) {
		System.out.println("상품을 구매했습니다.");
		seller.sell(this);
		//this.quantity++;
	}
	
	/*public void pay( Seller seller ) {
		this.money -= seller.getCost();
	}  관례상 상수는 setter을 사용하지 않는다. */
	public void pay( int cost ) {
		this.money -= cost;
	}
	
	@Override
	public String toString() {
		// 생성자에서 this 출력하면 toString 메소드 부름 & print 파라미터로 객체명 입력하면 자동출력
		String message = String.format("구매자가 가진 돈 : %d, 구매한 상품 갯수 : %d", this.money, this.quantity);
		return message;
	}
	
	
}
