package com.ktds.ln.bicycleRent;

import java.util.Scanner;

import com.ktds.ln.bicycleRent.biz.BicycleRentBiz;
import com.ktds.ln.bicycleRent.biz.BicycleRentBizImpl;

public class BicycleRentController {
	
	private BicycleRentBiz bicycleRentBiz = new BicycleRentBizImpl();
	private Scanner input = new Scanner(System.in);
	private final static int RENT = 1;
	private final static int RETURN = 2;
	private final static int EXIT = 3;
	private int selectedNum;
	
	public static void main(String[] args) {
		new BicycleRentController().start();
	}

	public void start() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("=================================");
			System.out.println(" < 자전거 대여 서비스 >");
			bicycleRentBiz.initView();
			
			System.out.println("번호를 입력하세요.");
			selectedNum = input.nextInt();
	
			if(selectedNum == RENT) {
				bicycleRentBiz.rentBicycle();
			}
			
			else if( selectedNum == RETURN ) {
				bicycleRentBiz.returnBicycle();
			}
			
			else if(selectedNum == EXIT) {
				break;
			}
			
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
