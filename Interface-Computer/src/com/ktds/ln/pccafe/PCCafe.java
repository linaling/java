package com.ktds.ln.pccafe;

import com.ktds.ln.AppleComputer;
import com.ktds.ln.Computer;
import com.ktds.ln.LGComputer;
import com.ktds.ln.SamsungComputer;

public class PCCafe {

	public static void main(String[] args) {
		
		Computer[] computers = new Computer[5];
		
		computers[0] = new SamsungComputer();
		computers[1] = new LGComputer();
		computers[2] = new SamsungComputer();
		computers[3] = new AppleComputer();
		computers[4] = new LGComputer();
		
		for( Computer computer : computers ) {
			computer.input();
			computer.compute();
			computer.store();
			System.out.println("=================");
			
			if( computer instanceof AppleComputer ) {
				((AppleComputer) computer ).faceTime();
			}
		}
		
	}
	
}
