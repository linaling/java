package com.ktds.ln.bicycleRent.dao;

import com.ktds.ln.bicycleRent.vo.BicycleVO;

public interface BicycleRentDao {
	
	public BicycleVO rentBicycle(int selectedNum);
	public double returnBicycle(double hour, int selectedNum);
	
}
