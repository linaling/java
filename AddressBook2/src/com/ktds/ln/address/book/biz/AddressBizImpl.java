package com.ktds.ln.address.book.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.ln.address.book.dao.AddressDao;
import com.ktds.ln.address.book.dao.AddressDaoImpl;
import com.ktds.ln.address.book.vo.AddressVO;

public class AddressBizImpl implements AddressBiz {

	private Scanner input;
	private AddressDao addressDao;

	public AddressBizImpl() {
		input = new Scanner(System.in);
		addressDao = new AddressDaoImpl();
	}

	@Override
	public void queryAllList() {
		List<AddressVO> addressList = addressDao.queryAllList();
		for (AddressVO address : addressList) {
			printAddressInformation(address);
		}
	}

	/* 반복되는 작업은 첫번째 반복 바로 아래 메소드 추가하기 
	 * - refactor - extract Method...*/
	private void printAddressInformation(AddressVO address) {
		System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", address.getName(), address.getPhoneNumber(),
				address.getAddress());
	}
	
	@Override
	public void findOneAddress() {
		int addressNumber = inputAddressNumber();
		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		printAddressInformation(addressVO);
	}

	private int inputAddressNumber() {
		System.out.println("주소록에 번호를 입력하세요.");
		int addressNumber = input.nextInt();
		return addressNumber;
	}

	@Override
	public void removeAddress() {
		int addressNumber = inputAddressNumber();
		addressDao.removeAddress(addressNumber);
	}

	@Override
	public void updateAddress() {
		int addressNumber = inputAddressNumber();
		input.nextLine();

		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		printAddressInformation(addressVO);

		addressVO = createNewAddress();

		addressDao.updateAddress(addressNumber, addressVO);
	}

	private AddressVO createNewAddress() {
		
		System.out.println("새로운 주소 정보를 입력하세요.");
		System.out.println("이름을 입력하세요.");
		String nameTemp = input.next();
		System.out.println("전화번호를 입력하세요.");
		String phoneNumberTemp = input.next();
		System.out.println("주소를 입력하세요.");
		String addressTemp = input.next();

		AddressVO addressVO = new AddressVO();
		addressVO.setName(nameTemp);
		addressVO.setPhoneNumber(phoneNumberTemp);
		addressVO.setAddress(addressTemp);
		return addressVO;
	}

	@Override
	public void addAddress() {
		AddressVO addressVO = createNewAddress();
		addressDao.addAddress(addressVO);

	}

}
