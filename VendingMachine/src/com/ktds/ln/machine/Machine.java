package com.ktds.ln.machine;

import com.ktds.ln.buyer.Buyer;

/**
 * 자판기 프로그램을 만들어보세요. 자판기 프로그램의 등장인물 또는 객체를 정하고 역할을 정의하세요 자판기의 판매 상품은 3개 이상으로 지정해
 * 주세요.
 * 
 * @author Admin
 *
 */
public class Machine {

	private final int COKE_COST = 1500;
	private final int CIDER_COST = 1200;
	private final int COCOA_COST = 800;

	// 변수
	private int quantityOfCoke;
	private int quantityOfCider;
	private int quantityOfCocoa;
	private int income;

	public Machine(int income, int quantityOfCoke, int quantityOfCider, int quantityOfCocoa) {

		System.out.println("***************");
		System.out.println("자판기가 켜졌습니다.");
		System.out.println("***************");
		setIncome(income);
		setQuantityOfCoke(quantityOfCoke);
		setQuantityOfCider(quantityOfCider);
		setQuantityOfCocoa(quantityOfCocoa);

		System.out.println(this);
	}

	// getter, setter
	public void setQuantityOfCoke(int quantityOfCoke) {
		this.quantityOfCoke = quantityOfCoke;
	}

	public void setQuantityOfCider(int quantityOfCider) {
		this.quantityOfCider = quantityOfCider;
	}

	public void setQuantityOfCocoa(int quantityOfCocoa) {
		this.quantityOfCocoa = quantityOfCocoa;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getQuantityOfCoke() {
		return this.quantityOfCoke;
	}

	public int getQuantityOfCider() {
		return this.quantityOfCider;
	}

	public int getQuantityOfCocoa() {
		return this.quantityOfCocoa;
	}

	public int getIncome() {
		return this.income;
	}

	// method
	public void giveProduct(Buyer buyer) {

		int productNum =1;
		for (;;) {

			if ( (buyer.getMoney() < COKE_COST) && (buyer.getMoney() < COCOA_COST) 
					&& (buyer.getMoney() < CIDER_COST)) {
				System.out.println("돈이 부족합니다. 주문을 종료합니다.");
				break;
			}

			if (productNum == 4) {
				System.out.println("주문을 종료합니다.");
				break;
			}
			
			System.out.println("***************");
			System.out.println("1. 콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 코코아");
			System.out.println("4. 안사기");
			System.out.println("***************");
			System.out.print("번호를 눌러 주세요 : ");
			
			productNum = buyer.selectMenu();

			switch (productNum) {
			case 1:
				System.out.println("콜라 나갑니다.");
				buyer.pay(COKE_COST);
				buyer.setQuantityOfCoke(buyer.getQuantityOfCoke() + 1);
				quantityOfCoke--;
				income += COKE_COST;
				break;
			case 2:
				System.out.println("사이다 나갑니다.");
				buyer.pay(CIDER_COST);
				buyer.setQuantityOfCider(buyer.getQuantityOfCider() + 1);
				quantityOfCider--;
				income += CIDER_COST;
				break;
			case 3:
				System.out.println("코코아 나갑니다.");
				buyer.pay(COCOA_COST);
				buyer.setQuantityOfCocoa(buyer.getQuantityOfCocoa() + 1);
				quantityOfCocoa--;
				income += COCOA_COST;
				break;
			default:
				System.out.println("잘못된 선택입니다.");
				break;
			}
			
			System.out.println(buyer);
			System.out.println(this);
		}
	}

	@Override
	public String toString() {
		String message = String.format("남은 콜라 개수 : %d\n남은 사이다 개수 : %d\n남은 코코아 개수 : %d\n번 돈 :%d\n", quantityOfCoke,
				quantityOfCider, quantityOfCocoa, income);
		return message;

	}

}
