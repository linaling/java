package com.ktds.lnc;

public class CalculatorMain {

	public static void main( String[] args ) {
		
		Calculator calculator = new Calculator();
		calculator.printComputeResult();
		calculator.printComputeResult(10, 50);
		
		int paramdata = calculator.getAndPrintMultiplicationResult(100, 50);
		int result = calculator.getAndPrintMultiplicationResult(paramdata, 7);

		String message = String.format("%d * %d = %d", 10, 7, result);
		System.out.println(message);
	}
}
