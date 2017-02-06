package com.ktds.ln.vm.biz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktds.ln.vm.dao.VMDaoImpl;
import com.ktds.ln.vm.vo.MachineVO;
import com.ktds.ln.vm.vo.VMVO;

public class VMBizImpl implements VMBiz {

	private final int MINIMUM_MONEY = 900;

	private VMDaoImpl vmDao;
	private Scanner input;

	public VMBizImpl() {
		vmDao = new VMDaoImpl();
		input = new Scanner(System.in);
	}

	@Override
	public void showMenu() {
		List<VMVO> vmList = new ArrayList<VMVO>();
		vmList = vmDao.showMenu();

		System.out.println("***********************************");
		System.out.println(" 상품번호\t상품명\t상품가격\t상품개수");
		int i = 1;
		for (VMVO vmVo : vmList) {
			System.out.println(" " + i + "\t" + vmVo.getDrinkName() + "\t" + vmVo.getCostPerOneDrink() + "\t"
					+ vmVo.getNumOfDrink());
			i++;
		}
		// vmDao.chooseProduct(vmVo);
	}

	@Override
	public void chooseProduct() {
		int money = 0;
		VMVO vmVo = new VMVO();
		MachineVO machineVo = new MachineVO();
		
		System.out.println("***********************************");
		System.out.println(" 돈을 넣어주세요 : ");
		money = input.nextInt(); // 돈 받음
		
		for(;;) {
			System.out.println("***********************************");
			System.out.println(" 투입 금액 : " + money + "원");
			if( money >= MINIMUM_MONEY ) {
				break;
			}
			giveMoreMoney(money);
		}
		
		showMenu(); // 메뉴보여주고 고르세요.
		
		System.out.println("***********************************");
		
		System.out.println(" 상품 번호를 입력하세요 : ");
		int productNumber = input.nextInt();
		
		vmVo = vmDao.chooseProduct(productNumber - 1); // 상품 고르기
		
		System.out.println("***********************************");
		System.out.println(" 상품 가격은 " + vmVo.getCostPerOneDrink() +"원입니다."); // 가격 알려주고
		System.out.println(" " + vmVo.getDrinkName() + " .. 띠용");
		
		money -= vmVo.getCostPerOneDrink(); // 사용자 돈 빼기
		vmVo.setNumOfDrink(vmVo.getNumOfDrink() - 1); // 재고 개수 -1
		machineVo.setMoney(machineVo.getMoney() + vmVo.getCostPerOneDrink()); // 머신의 돈 더하기
		
		// 거스름돈 반환, 또는 상품 더 고르기 선택
		stopOrMore(money);
		
	}

	public void giveMoreMoney(int money) {
		System.out.println(" 돈이 부족합니다. 돈을 더 넣어주세요 : ");
		money += input.nextInt();
	}

	public void printLeftMoney(int money) {
		System.out.println("***********************************");
		System.out.println(" 거스름돈은 " + money + "원입니다.");
		System.out.println(" 1. 거스름돈 반환하기 ");
		System.out.println(" 2. 더 주문하기");
	}

	public void stopOrMore(int money) {
		for(;;) {
			printLeftMoney(money);
			int select = input.nextInt();
			
			if( select == 1 ) {
				//거스름돈반환
				System.out.println(" " + money +"원 .. 짤랑");
				break;
			}
			else if( select == 2 ) {
				//더 주문하기
				chooseProduct(); // 만약 돈이 부족하면? 
				break;
			}
			else {
				// 
				System.out.println("잘못된 번호입니다 ! ");
			}
		}
	}
	@Override
	public void returnMoney() {
		// TODO Auto-generated method stub

	}

	public void initView() {
		// TODO Auto-generated method stub

	}

}
