package com.ktds.ln.buyer;
import com.ktds.ln.seller.Seller;
import com.ktds.ln.vo.BasketVO;
/**
 * 
 * Seller에게 상품을 구매하고 금액을 Seller에게 지불한다.
 * 
 */
public class Buyer implements BuyerInterface {
	
	private BasketVO basketVO;

	public Buyer( int productQuantity, int money ) {
		System.out.println("구매자를 생성합니다!");
		
		basketVO = new BasketVO();
		// 초기값 셋팅
		basketVO.setProductQuantity(productQuantity);
		basketVO.setMoney(money);
		
		// 현황 출력하기
		System.out.println(this);
	}

	/**
	 * 구매하기
	 * 구매자가 가진 상품 개수에 1 더해준다.
	 */
	public void buy( Seller seller ) {
		seller.sell(this /* 호출자 */);
		
		basketVO.plusProductQuantity();
	}
	
	/**
	 * 지불하기
	 * 구매자가 가진 돈에서 지불할 돈을 뺀다.
	 * @param money : 지불할 금액
	 */
	public void pay( int money ) {
		basketVO.minusMoney(money);
	}
	
	/**
	 * 구매자 현황 파악하기
	 */
	@Override
	public String toString() {
		
		String message = 
				String.format("구매한 상품 개수 : %d\n구매자가 가진 금액 : %d", 
						basketVO.getProductQuantity(), basketVO.getMoney());
		
		return message;
	}
}
