package com.ktds.ln;

public class Car {

	private String modelName;
	private int oilTankVolume;
	private int money;
	private int oilStock;

	public Car(String modelName, int oilTankVolume, int money) {
		this.modelName = modelName;
		this.oilTankVolume = oilTankVolume;
		this.money = money;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getOilTankVolume() {
		return oilTankVolume;
	}

	public void setOilTankVolume(int oilTankVolume) {
		this.oilTankVolume = oilTankVolume;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setOilStock(int oilStock) {
		this.oilStock = oilStock;
	}

	public int getOilStock() {
		return oilStock;
	}

	// method
	public void fillOil( OilBank oilbank ) {
		
		oilStock += oilTankVolume;
		
		this.money -= oilTankVolume * oilbank.getPricePerLiter();
	}

}
