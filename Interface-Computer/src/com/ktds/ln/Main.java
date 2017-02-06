package com.ktds.ln;

public class Main {

	public static void main(String[] args) {
		Computer computer = new SamsungComputer();
		
		computer.input();
		computer.compute();
		computer.store();
		
		Computer lgComputer = new LGComputer();
		
		lgComputer.input();
		lgComputer.compute();
		lgComputer.store();
		
		FaceTime appleComputer = new AppleComputer();
		
		appleComputer.input();
		appleComputer.compute();
		appleComputer.store();
		appleComputer.faceTime();
		
	}
}
