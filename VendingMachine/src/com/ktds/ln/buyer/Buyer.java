package com.ktds.ln.buyer;

import java.util.Scanner;

import com.ktds.ln.machine.Machine;

public class Buyer {

	// 변수
	private int quantityOfCoke;
	private int quantityOfCider;
	private int quantityOfCocoa;
	private int money;
	private int sumOfQuantity;

	public Buyer( int money, int quantity ) {
		
		System.out.println("***************");
		System.out.println("구매자가 왔습니다.");
		System.out.println("***************");
		
		setMoney(money);
		setQuantityOfCoke(quantity);//바꾸기
		
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
	
	public void setMoney( int money ) {
		this.money = money;
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

	public int getMoney() {
		return this.money;
	}
	
	// method
	public int selectMenu() {
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		return menu;
	}
	
	
	
	public void buyProduct( Machine machine ) {
		
		machine.giveProduct(this);
		
		/*switch( productNum ) {
		case 1 : 
			System.out.println("콜라 구매");
			//quantityOfCoke++;
			break;
		case 2 : 
			System.out.println("사이다 구매");
			//quantityOfCider++;
			break;
		case 3 :
			System.out.println("코코아 구매");
			//quantityOfCocoa++;
			break;
		}*/
		
	}
	
	public void pay( int cost ) {
		this.money -= cost;
	}
	
	@Override
	public String toString() {
		sumOfQuantity = quantityOfCoke + quantityOfCider + quantityOfCocoa;
		// 생성자에서 this 출력하면 toString 메소드 부름 & print 파라미터로 객체명 입력하면 자동출력
		String message = String.format("구매자가 가진 돈 : %d, 구매한 상품 갯수 : %d", this.money, this.sumOfQuantity);
		return message;
	}
}
