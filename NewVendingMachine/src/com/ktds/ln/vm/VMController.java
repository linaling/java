package com.ktds.ln.vm;

import com.ktds.ln.vm.biz.VMBiz;
import com.ktds.ln.vm.biz.VMBizImpl;

/*
 * 자판기
 * 콜라. 환타. 사이다
 * 가격 1000 1500 900
 * 준비금 500,000
 * 고객은 입력금액
 * 돈 -> 번호입력
 * 900원 < 돈 : 상품 나타나지 x, 돈 반환
 * 출력번호중 하나 입력하면 자판기에서 수 -1, 수익 +,
 * 고객은 상품 + , 거스름돈 받기
 * 프로그램 종료 : 재고 0 or 금액 0
 * 
 */
public class VMController {

		VMBiz vmBiz = new VMBizImpl(); 
		
	
	public void start() {
		
		System.out.println("------- 자판기 프로그램 -------");
	//	vmBiz.inivView();
		
	}
	
	public static void main(String[] args) {
		new VMController().start();
	}

	
}
