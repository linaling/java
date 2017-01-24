package com.ktds.ln;

import com.ktds.ln.buyer.Buyer;
import com.ktds.ln.seller.Seller;

public class Store {
	
	public void startStore() {
		Seller seller = new Seller(50000, 50);
		Buyer buyer = new Buyer(40000, 0);
		
		System.out.println("---------------");
		seller.sell(buyer);
		
		
		System.out.println(seller);
		System.out.println(buyer);
		
		System.out.println("---------------");
		buyer.buy(seller);
		
		System.out.println(seller);
		System.out.println(buyer);
		
		System.out.println("---------------");
		seller.sell(buyer);
		
		
		System.out.println(seller);
		System.out.println(buyer);
		
	}
	public static void main( String[] args ) {
	
		Store store = new Store();
		
		store.startStore();
	}

}
