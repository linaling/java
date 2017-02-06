package com.ktds.ln.buyer;

import com.ktds.ln.seller.Seller;

public interface BuyerInterface {

	public void buy( Seller seller );
	public void pay( int money );
	
}
