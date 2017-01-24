package com.ktds.ln;

import java.util.Scanner;

import com.ktds.ln.buyer.Buyer;
import com.ktds.ln.machine.Machine;

public class Shop {
	public void startShop( int productNum ) {
		
		Machine machine = new Machine(0, 10, 10, 10);
		Buyer buyer = new Buyer(5000, 0);
		
		System.out.println("***************");
		machine.giveProduct(buyer, productNum);
		
		System.out.println(machine);
		System.out.println(buyer);
		
		System.out.println("***************");
		/*buyer.buyProduct(productNum, machine);

		System.out.println("***************");
		System.out.println(machine);
		System.out.println(buyer);*/
	}
	public void printMenu() {
		
		System.out.println("***************");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 코코아");
		System.out.println("***************");
		System.out.print("번호를 눌러 주세요 : ");
	}
	
	public static void main( String[] args ) {
		
		Scanner input = new Scanner(System.in);
		Shop shop = new Shop();
	
		
		shop.printMenu();
		int productNumber = input.nextInt();
		
		shop.startShop( productNumber );
		
	}
}
