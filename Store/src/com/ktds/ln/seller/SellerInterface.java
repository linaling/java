package com.ktds.ln.seller;

import com.ktds.ln.buyer.Buyer;

public interface SellerInterface {

	public void sell( Buyer buyer );
	public boolean isSoldOut();
}
