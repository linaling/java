package com.ktds.ln;

import java.util.Scanner;

public class BicycleRentalShop {

	private int numberOfBicycles;

	public BicycleRentalShop(int numberOfBicycles, int rentalFee) {

		this.numberOfBicycles = numberOfBicycles;
		this.rentalFee = rentalFee;
	}

	private int income = 0;
	private int rentalFee;

	// getter, setter
	public int getNumberOfBicycles() {
		return numberOfBicycles;
	}

	public void setNumberOfBicycles(int numberOfBicycles) {
		numberOfBicycles = numberOfBicycles;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getRentalFee() {
		return rentalFee;
	}

	public void setRentalFee(int rentalFee) {
		this.rentalFee = rentalFee;
	}

	// method
	public void lendBicycle(Customer customer) {

		printNow(customer, this); // 초기 상황 보여주기
		
		for (;;) {
			System.out.println("=======================================");
			System.out.println(" 0을 입력할 경우 프로그램이 종료됩니다.");
			System.out.print("  몇 대를 빌리시겠습니까?  ");			
			
			Scanner input = new Scanner(System.in);
			int howMany = input.nextInt();

			if (howMany == 0) {
				break;
			}

			customer.setNumberOfBicycles(howMany);

			// 자전거수 -, 돈 +, 고객은 빌림
			numberOfBicycles -= customer.getNumberOfBicycles();
			income = customer.getNumberOfBicycles() * rentalFee;

			customer.borrow(this);
			
			printNow(customer, this);
		}
	}
	
	public void printNow(Customer customer, BicycleRentalShop bRShop) {
		
		System.out.println("=======================================");
		System.out.println("    자전거 대여점 현황");
		System.out.println("---------------------------------------");
		System.out.println(bRShop);
		System.out.println("=======================================");
		System.out.println();
		System.out.println("=======================================");
		System.out.println("    대여자 현황");
		System.out.println("---------------------------------------");
		System.out.println(customer);
		System.out.println("=======================================");
		
	}

	@Override
	public String toString() {
		String message = String.format("    자전거 보유 수 : %d대\n    대여료 총 합 : %d원\n", numberOfBicycles, income);
		return message;

	}

}
