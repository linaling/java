package com.ktds.ln;

import java.util.Scanner;

import com.ktds.ln.buyer.Buyer;
import com.ktds.ln.machine.Machine;

public class Shop {
	
	public void start() {
		Machine machine = new Machine(0, 10, 10, 10);
		Buyer buyer = new Buyer(5000, 0);
		
		buyer.buyProduct(machine);
		
		System.out.println(buyer);
		System.out.println(machine);
	}

	public void trade(int productNum, Machine machine, Buyer buyer) {

		//machine.giveProduct(buyer, productNum);

		System.out.println(machine);
		System.out.println(buyer);

		System.out.println("***************");
	}

	public void printMenu() {

		//System.out.println("***************");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 코코아");
		System.out.println("4. 안사기");
		System.out.println("***************");
		System.out.print("번호를 눌러 주세요 : ");
	}

	public static void main(String[] args) {

		
		Shop shop = new Shop();
		
		shop.start();
		
		
		
		
	/*	Scanner input = new Scanner(System.in);
		Shop shop = new Shop();

		Machine machine = new Machine(0, 10, 10, 10);
		Buyer buyer = new Buyer(5000, 0);

		System.out.println("***************");

		for (;;) {

			shop.printMenu();
			int productNumber = input.nextInt();
			
			if(productNumber == 4){
				System.out.println("자판기 종료");
				break;
			}
			shop.trade(productNumber, machine, buyer);

		}*/

	}
}
