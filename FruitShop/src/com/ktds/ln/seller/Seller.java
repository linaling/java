package com.ktds.ln.seller;

import com.ktds.ln.buyer.Buyer;

public class Seller {
	
	private final int FRUIT_COST = 3000;
	
	private int money;
	private int quantity;
	
	
	public Seller( int money, int quantity ) {
		
		System.out.println("판매자를 생성합니다.");
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
	
	/*public int getCost() {
		return this.FRUIT_COST;
	}
	관례상 상수는 setter을 사용하지 않는다. */
	public void sell(Buyer buyer) {
		
		System.out.println("상품이 팔렸습니다.");
		buyer.pay(FRUIT_COST);
		buyer.setQuantity(buyer.getQuantity() + 1);
		quantity--;
		money += FRUIT_COST;
	}
	
	@Override
	public String toString() {
		// 생성자에서 this 출력하면 toString 메소드 부름 & print 파라미터로 객체명 입력하면 자동출력
		String message = String.format("가진 상품 개수 : %d, 판매자가 가진 금액 : %d", this.quantity, this.money);
		return message;
	}

}
