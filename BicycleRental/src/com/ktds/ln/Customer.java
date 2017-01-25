package com.ktds.ln;

public class Customer {

	private int numberOfBicycles;
	private int money;

	// getter, setter
	public int getNumberOfBicycles() {
		return numberOfBicycles;
	}

	public void setNumberOfBicycles(int numberOfBicycles) {
		this.numberOfBicycles = numberOfBicycles;
	}

	public int getMoney() {
		return money;
	}

	public Customer(int numberOfBicycles, int money) {
		this.numberOfBicycles = numberOfBicycles;
		this.money = money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// method
	public void borrow(BicycleRentalShop bRShop) {
		// 돈 -, 빌린자전거갯수 +
		money -= bRShop.getRentalFee() * numberOfBicycles;

	}
	
	@Override
	public String toString() {
		String message = String.format("    자전거 보유 수 : %d대\n    보유 금액 : %d원\n", numberOfBicycles, money);
		return message;
	
	}

}
