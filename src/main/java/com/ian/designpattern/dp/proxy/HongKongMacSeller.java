package com.ian.designpattern.dp.proxy;

public class HongKongMacSeller implements IMacSeller {
	
	IMacSeller seller = new USAMacSeller();
	
	@Override
	public void buy() {		
		System.out.println("buy Mac book from hongknog");
		seller.buy();
	}

}
