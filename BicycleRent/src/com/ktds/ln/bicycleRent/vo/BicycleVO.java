package com.ktds.ln.bicycleRent.vo;

public class BicycleVO {

	private int bicycleLevel;
	private int bicycleStockLow;
	private int bicycleStockMid;
	private int bicycleStockHigh;
	
	public BicycleVO ( int size ) {
		bicycleStockLow = size;
		bicycleStockMid = size;
		bicycleStockHigh = size;
	}
	public int getBicycleLevel() {
		return bicycleLevel;
	}
	public void setBicycleLevel(int bicycleLevel) {
		this.bicycleLevel = bicycleLevel;
	}
	public int getBicycleStockLow() {
		return bicycleStockLow;
	}
	public void setBicycleStockLow(int bicycleStockLow) {
		this.bicycleStockLow = bicycleStockLow;
	}
	public int getBicycleStockMid() {
		return bicycleStockMid;
	}
	public void setBicycleStockMid(int bicycleStockMid) {
		this.bicycleStockMid = bicycleStockMid;
	}
	public int getBicycleStockHigh() {
		return bicycleStockHigh;
	}
	public void setBicycleStockHigh(int bicycleStockHigh) {
		this.bicycleStockHigh = bicycleStockHigh;
	}
	

	
}
