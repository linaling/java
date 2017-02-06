package com.ktds.ln.vm.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.ln.vm.vo.VMVO;

public class VMDaoImpl implements VMDao {

	private List<VMVO> vmList;
	
	public VMDaoImpl() {
		vmList = new ArrayList<VMVO>();
	}
	
	@Override
	public List<VMVO> showMenu() {
		return vmList;
	}

	@Override
	public VMVO chooseProduct(int productNumber) {
		return vmList.get(productNumber);
	}

	@Override
	public void returnMoney() {
		
	}

}
