package com.ktds.ln;

public class AppleComputer implements FaceTime {

	@Override
	public void input() {
		System.out.println("Mac Keyboard로 입력합니다.");
		
	}

	@Override
	public void compute() {
		System.out.println("Apple Cpu를 사용해 게산합니다.");
		
	}

	@Override
	public void store() {
		System.out.println("Samsung SSD에 저장합니다.");		
	}

	@Override
	public void faceTime() {
		System.out.println("카메라로 영상통화를 합니다.");
	}
	
}
