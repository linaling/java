package com.ktds.ln.bicycleRent.dao;

import com.ktds.ln.bicycleRent.constant.BicycleConstants;
import com.ktds.ln.bicycleRent.vo.BicycleVO;

public class BicycleRentDaoImpl implements BicycleRentDao {

	private BicycleVO bicycle;
	
	public BicycleRentDaoImpl() {
		bicycle = new BicycleVO(BicycleConstants.BICYCLE_SIZE);		
	}
	
	@Override
	public BicycleVO rentBicycle(int selectedNum) {
		if( selectedNum == 0 ) {
			bicycle.setBicycleStockLow(bicycle.getBicycleStockLow() - 1);
		}
		else if( selectedNum == 1 ) {
			
			bicycle.setBicycleStockMid(bicycle.getBicycleStockMid() - 1);
			
		}
		else if ( selectedNum == 2 ) {
			bicycle.setBicycleStockHigh(bicycle.getBicycleStockHigh() - 1);
		}
		bicycle.setBicycleLevel(selectedNum);
		return bicycle;
	}

	@Override
	public double returnBicycle(double hour, int selectedNum) {
		double cost = 0;
		if( selectedNum == 0 ) {
			bicycle.setBicycleStockLow(bicycle.getBicycleStockLow() + 1);
		}
		else if( selectedNum == 1 ) {
			bicycle.setBicycleStockMid(bicycle.getBicycleStockMid() + 1);
		}
		else if( selectedNum == 2 ) {
			bicycle.setBicycleStockHigh(bicycle.getBicycleStockHigh() + 1);
		}
		
		cost = hour * BicycleConstants.BICYCLE_PRICE[selectedNum];
		return cost;
	}

}
