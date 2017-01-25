package com.ktds.ln;

public class Main {

	public void start() {

		BicycleRentalShop bRShop = new BicycleRentalShop(100, 5000);
		Customer customer = new Customer(0, 50000);

		bRShop.lendBicycle(customer);

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.start();

	}
}
