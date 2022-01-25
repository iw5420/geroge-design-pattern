package com.ian.designpattern.dp.proxy;

public class USAMacSeller implements IMacSeller {

	@Override
	public void buy() {
		System.out.println("buy a mac book from USA");	
	}

}
