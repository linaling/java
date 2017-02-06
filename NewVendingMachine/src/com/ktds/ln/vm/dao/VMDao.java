package com.ktds.ln.vm.dao;

import java.util.List;

import com.ktds.ln.vm.vo.VMVO;

public interface VMDao {

	public List<VMVO> showMenu();
	public VMVO chooseProduct(int productNumber);
	public void returnMoney();
		
}
