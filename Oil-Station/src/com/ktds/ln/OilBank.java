package com.ktds.ln;

public class OilBank {

	private int oilStoc;
	private int pricePerLiter;
	private int budget;
	
	// setter, getter
	public void setOilStoc(int oilStoc) {
		this.oilStoc = oilStoc;
	}
	
	public int getOilStoc() {
		return oilStoc;
	}
	
	public void setPricePerLiter(int pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}
	
	public int getPricePerLiter() {
		return pricePerLiter;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	public int getBudget() {
		return budget;
	}
	
	public void filling( Car car ) {
		this.oilStoc -= car.getOilTankVolume(); // 만땅주세여
		
		car.fillOil(this);
		
		this.budget += pricePerLiter * car.getOilTankVolume();
		
	}
	
}
