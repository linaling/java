package com.ktds.ln.bicycleRent.biz;

import java.util.Scanner;

import com.ktds.ln.bicycleRent.constant.BicycleConstants;
import com.ktds.ln.bicycleRent.dao.BicycleRentDao;
import com.ktds.ln.bicycleRent.dao.BicycleRentDaoImpl;
import com.ktds.ln.bicycleRent.vo.BicycleVO;

public class BicycleRentBizImpl implements BicycleRentBiz{

	private Scanner input;
	private BicycleRentDao bicycleRentDao;
	private BicycleVO bicycleVO;
	
	public BicycleRentBizImpl() {
		input = new Scanner(System.in);
		bicycleRentDao = new BicycleRentDaoImpl();
	}


	@Override
	public void rentBicycle() {
		System.out.println("=================================");
		System.out.println(" < 대여 가격 > ");
		System.out.println("=================================");
		printBicycleLevels();
		
		System.out.println("=================================");
		System.out.println("종류를 선택해주세요.");
		int selectedNum = input.nextInt();
		
	//	System.out.println("selectedNum = " + selectedNum);
		
		bicycleVO = bicycleRentDao.rentBicycle(selectedNum - 1);
		
		if(selectedNum == 1) {
			if( bicycleVO.getBicycleStockLow() <= 0 ) {
				System.out.println("=================================");
				System.out.println("재고가 부족합니다.");
				return ;
			}
		}
		
		else if(selectedNum == 2) {
			if( bicycleVO.getBicycleStockMid() <= 0 ) {
				System.out.println("=================================");
				System.out.println("재고가 부족합니다.");
				return ;
			}
		}
		
		else if(selectedNum == 3) {
			if( bicycleVO.getBicycleStockHigh() <= 0 ) {
				System.out.println("=================================");
				System.out.println("재고가 부족합니다.");
				return ;
			}
		}
		
		System.out.println("=================================");
		System.out.println(" 대여가 완료되었습니다. ");
		
		System.out.println("=================================");
		System.out.println(" < 재고 > ");
		System.out.println("=================================");
		System.out.println(" 초급\t중급\t고급");
		System.out.println(" " + bicycleVO.getBicycleStockLow() + "\t" 
				+ bicycleVO.getBicycleStockMid() + "\t" + bicycleVO.getBicycleStockHigh());
		
			
		
	}


	private void printBicycleLevels() {
		String message;
		for(int i = 0; i < BicycleConstants.BICYCLE_SIZE; i ++) {
			message = String.format("%d. %s 시간당 %d원\n" , i+1, BicycleConstants.BICYCLE_LEVEL[i]
					, BicycleConstants.BICYCLE_PRICE[i]);
			System.out.println(message);
		}
	}
	

	@Override
	public void returnBicycle() {
		System.out.println("=================================");
		System.out.println("어떤 종류를 반납하시겠습니까? ");
		printBicycleLevels();
		System.out.println("=================================");
		int selectedNum = input.nextInt();
		
		System.out.println("=================================");
		System.out.println("시간을 입력하세요.(분)");
		int minutes = input.nextInt();
		
		double hour = minutes / 60.0;
		double price = bicycleRentDao.returnBicycle(hour, selectedNum - 1);
		
		System.out.println("=================================");
		System.out.printf("총 금액은 %d원 입니다.\n", (int)price);
		
		
	}

	@Override
	public void initView() {
		System.out.println("=================================");
		System.out.println("1. 대여");
		System.out.println("2. 반납");
		System.out.println("3. 종료");
		System.out.println("=================================");
	}

}
