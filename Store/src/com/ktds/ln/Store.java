package com.ktds.ln;

import com.ktds.ln.buyer.Buyer;
import com.ktds.ln.seller.Seller;

public class Store {
	
	public void start() {
		
		/*int numberOne = 10;
		int numberTwo = numberOne;
		
		numberTwo++;
		System.out.println(numberOne);
		System.out.println(numberTwo);  primitive 타입*/
		
		/*Buyer ljs = new Buyer(0, 5000000);
		Buyer jgu = ljs; // 같은 메모리를 주겠다는 뜻. primitive와는 다르다.
		
		ljs.buy();

		System.out.println(ljs);
		System.out.println(jgu);*/
		
		Seller seller = new Seller(50, 50000);
		Buyer buyer = new Buyer(0, 40000);
		
		System.out.println("---------------");
		seller.sell(buyer);
		
		
		System.out.println(seller);
		System.out.println(buyer);
		
		System.out.println("---------------");
		buyer.buy(seller);
		
		System.out.println(seller);
		System.out.println(buyer);
		
		/*System.out.println("장터에 오신 것을 환영합니다 ! ");
		Buyer jjh = new Buyer(0, 500000);
		Seller mjk = new Seller(100, 5000000);
		
		System.out.println("바이어 : 상품 좀 살게요. 이 상품 1개 주세요.");
		mjk.sell();
		jjh.buy();
		
		System.out.println("셀러 : 2500원 입니다.");
		jjh.pay(2500);
		
		System.out.println(mjk);
		System.out.println(jjh);*/
		
	}

	public static void main( String[] args ) {
		
		new Store().start();
		
	}
}
