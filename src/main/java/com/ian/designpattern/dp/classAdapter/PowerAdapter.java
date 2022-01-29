package com.ian.designpattern.dp.classAdapter;

public class PowerAdapter extends Power220 implements Power5V{

	@Override
	public void getPower5V() {
		super.getPower220();
		transform();
	}

	void transform() {
		System.out.println("我們做變壓處理!");		
	}

}
